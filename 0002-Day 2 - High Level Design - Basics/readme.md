We try to explain some of the terminologies in simple words. Lookup wiki for a more formal definition.

* **Replication** : Replication refers to frequently copying the data across multiple machines. Post replication, multiple copies of the data exists across machines. This might help in case one or more of the machines die due to some failure.
* **Consistency** : Assuming you have a storage system which has more than one machine, consistency implies that the data is same across the cluster, so you can read or write to/from any node and get the same data.
* **Eventual consistency** : Exactly what the name suggests. In a cluster, if multiple machines store the same data, an eventual consistent model implies that all machines will have the same data eventually. Its possible that at a given instance, those machines have different versions of the same data ( temporarily inconsistent ) but they will eventually reach a state where they have the same data.
* **Availability** : In the context of a database cluster, Availability refers to the ability to always respond to queries ( read or write ) irrespective of nodes going down.
* **Partition Tolerance** : In the context of a database cluster, cluster continues to function even if there is a “partition” (communications break) between two nodes (both nodes are up, but can’t communicate).
* **Vertical scaling and Horizontal scaling** : In simple terms, to scale horizontally is adding more servers. To scale vertically is to increase the resources of the server ( RAM, CPU, storage, etc. ).
  Example: Lets say you own a restaurant which is now exceeding its seating capacity. One way of accommodating more people ( scaling ) would be to add more and more chairs (scaling vertically). However since the space is limited, you won’t be able to add more chairs once the space is full.
  Another way of scaling would be to open new branches of the restaurant ( horizontal scaling ).
  Source : [http://stackoverflow.com/questions/5401992/what-does-scale-horizontally-and-scale-vertically-mean](http://stackoverflow.com/questions/5401992/what-does-scale-horizontally-and-scale-vertically-mean)
* **Sharding** : With most huge systems, data does not fit on a single machine. In such cases, sharding refers to splitting the very large database into smaller, faster and more manageable parts called data shards.
