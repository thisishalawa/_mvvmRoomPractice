package master.mvvm.room_practice.subscribers.repository

import master.mvvm.room_practice.subscribers.data.Subscriber
import master.mvvm.room_practice.subscribers.data.db.SubscriberDAO


/*
*  4 Repository
*
* */
class SubscriberRepository(private val dao: SubscriberDAO) {

    val subscribers = dao.getAllSubscribers()

    suspend fun insert(subscriber: Subscriber): Long {
        return dao.insertSubscriber(subscriber)
    }

    suspend fun update(subscriber: Subscriber): Int {
        return dao.updateSubscriber(subscriber)
    }

    suspend fun delete(subscriber: Subscriber): Int {
        return dao.deleteSubscriber(subscriber)
    }

    suspend fun deleteAll(): Int {
        return dao.deleteAll()
    }
}