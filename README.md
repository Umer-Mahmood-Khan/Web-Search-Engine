# Web-Search-Engine
A web search engine is a software application that crawls the internet to index and then returns results depending on the user's search query. The search results are usually displayed as a line of links to web pages, photos, videos, infographics, articles, research papers, and other types of files.


## Features

![image](https://github.com/Umer-Mahmood-Khan/Web-Search-Engine/assets/134300979/3a2cb6b7-3fd9-4963-ae94-43c2ae1caae4)



We discuss the each feature in brief detail below.

### Web Crawler
The purpose of the Web crawler often known as spider or a search engine bot is to traverse to DOM(Document Object Model) data obtained by the browser on search and crawl through all of the linked pages. Later, human readable content is downloaded in the form of text files (using Jsoup), which is then used to perform various features such as caching, page ranking, word suggestion, and auto complete.

### Caching
Caching is used for faster retrieval of information. When pages are cached, they are displayed as the crawler indexed them; when the live version is unavailable, we can use the cached version. All the content from the website will be saved offline so that users can access data when the internet is unavailable.
Cache will save the content in the text file which can further be deleted.

### Ranking of Web Pages
We have ranked web pages according to the occurrence of the word. When the user searches for the word, the name of the text file containing highest occurrence of the word and the number of occurrences of that word in that file will be displayed. TST(Ternary Search Tree)data structure ranks pages.

### Word Suggestion
Word suggestion is used when the user enters a word that is incorrect or not found in the long list of valid words called the dictionary.
Edit Distance Algorithm is used to suggest a “similar” word that has the shortest edit distance to the entered word.

### Auto Complete
Auto Complete is used to predict the words only with the help of a few typed characters by the user. Trie data structure is used for storing strings to support fast pattern matching.


## Architecture of Search Engine
![image](https://github.com/Umer-Mahmood-Khan/Web-Search-Engine/assets/134300979/d7e94c04-2f34-45cd-a966-f65fe9f2658b)


## Flow Chart
![image](https://github.com/Umer-Mahmood-Khan/Web-Search-Engine/assets/134300979/40cf0c81-972d-4a0f-8d16-24aeb3a53031)


## References
To understand the workings of search engines and learn basic terminologies.
``` https://www.computerhope.com/jargon/s/searengi.htm ```











