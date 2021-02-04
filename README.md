## Coroutines-and-Retrofit-template

### There are majorly 4 types of Dispatchers:
   1. **Main Dispatcher:** *[runs in the main thread]* used to perform UI operations.
   2. **IO Dispatcher:** *[runs in the IO thread]* used to perform all data operations
       (networking & database operations).
   3. **Default Dispatcher:** *[runs in the Default thread]* used to perform long-running operations.
   4. **Unconfined Dispatcher:** *[not confined to any specific thread]* runs in the current thread,
       and resume the operation whenever it used in any other thread.
 ***************************************************************************************************
 ### There are two functions to start the Coroutines:
   1. **launch{}:** *[Will not block the main thread]* can be used at places where users do not want to
       use the returned result, which is later used in performing some other work.
   2. **Async{}:** *[will block the main thread at the entry point of await()]* can be used when making
       two or more network call in parallel, but you need to wait for the answers before computing
       the output.
 
  -  If you use async and do not wait for the result, it will work exactly the same as launch.
  -  While using this template, there's no need to use async, because we are using Callbacks.
  -  When using 'withContext' tasks are executed in a serial manner, but with 'async & wait'
       tasks run in parallel.
