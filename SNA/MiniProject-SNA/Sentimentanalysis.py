import nltk
from nltk.corpus import stopwords, twitter_samples
from nltk.sentiment import SentimentIntensityAnalyzer
from statistics import mean
from random import shuffle
from colorama import Fore
import nltk
nltk.download('twitter_samples')


//Load and test the VADER sentiment analyzer
sia = SentimentIntensityAnalyzer()
sia.polarity_scores("NLTK is a great package to perform NLP.")



green = Fore.GREEN
red = Fore.RED

def ispositive(tweet : str) -> bool:
    return sia.polarity_scores(tweet)["compound"] > 0

tweets = [tweet for tweet in twitter_samples.strings()]
shuffle(tweets)

for tweet in tweets[ : 10]:
    color = green
    if not ispositive(tweet):
        color = red
    print(f"{color}{tweet}")
