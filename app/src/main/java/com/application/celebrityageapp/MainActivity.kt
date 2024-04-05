package com.application.celebrityageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // assign variables to all the components
        val etAge = findViewById<EditText>(R.id.etAge).text // set the age component variable to text

        // assign all button variables
        val btnClear = findViewById<Button>(R.id.btnClear) // clear button variable
        val btnGenerate = findViewById<Button>(R.id.btnGenerate) // generate button variable

        // assign all text view variables
        val tvResult = findViewById<TextView>(R.id.display) //display text view variable

        // clear all fields function
        btnClear.setOnClickListener(){
            val clear = ""// will be used to replace the current tvResult with an empty string
            etAge.clear() // clear age field.
            tvResult.text = clear// clear the result field.
        }

        // generate content for the result field
        btnGenerate.setOnClickListener(){
            var message:String // This string variable will store the appropriate message for each famous person.
            val age = etAge.toString().toInt() //  store the age variable as an integer, to make it easier to work with.
            // If the number is ever less than zero we must ask the user to enter a valid number.
            if(age < 20 || age > 100){ //  check if the age is with the range of 20 & 100 years old
                tvResult.text = "Please enter a different age from 20 to 100 years old!"
            } else { // else the age is within our range

                // Code Attribution

                when(age){ // compare the age that the user entered to the one within our
                    // 15 -> message = "You are 15 years old, which is the same age as Anne Frank.\nAnne Frank was a Jewish diarist,\nknown for her diary documenting her experiences hiding from the Nazis during WWII."
                    // 19 -> message = "You are 19 years old, which is the same age as Tutankhamun.\nTutankhamun was a Pharaoh of ancient Egypt,\nknown for the discovery of his nearly intact tomb in the Valley of the Kings."
                    29 -> message = "You are 29 years old, which is the same age as Anne Boleyn.\nAnne Boleyn was the Queen of England,\nsecond wife of Henry VIII, known for her role in the English Reformation."
                    30 -> message = "You are 30 years old, which is the same age as Emily Brontë.\nEmily Brontë was a English novalist and poet,\nbest known for her novel 'Wuthering Heights'"
                    32 -> message = "You are 32 years old, which is the same age as Alexander the Great.\nAlexander the Great was an ancient Macedonian ruler who created one of the largest empires in history."
                    39 -> message = "You are 39 years old, which is the same age as Martin Luther King Jr.\nMartin Luther King Jr. was an American civil rights leader and advocate for nonviolent protest,\nknown for his role in the advancement of civil rights through nonviolent civil disobedience."
                    35 -> message = "You are 35 years old, which is the same age as Wolfgang Amadeus Mozart.\nWolfgang Amadeus Mozart was a classical composer,\nprodigy known for his symphonies, operas, and piano concertos."
                    69 -> message = "You are 69 years old, which is the same age as Elizabeth I.\nElizabeth I was the Queen of England and Ireland,\nknown for her reign as the Elizabethan era,\nmarked by a flourishing of English literature and exploration."
                    27 -> message = "You are 27 years old, which is the same age as Kurt Cobain.\nKurt Cobain was an American musician and frontman of the grunge band Nirvana, known for his songwriting and influence on alternative music."
                    36 -> message = "You are 36 years old, which is the same age as Princess Diana.\nPrincess Diana was a former Princess of Wales and humanitarian,\nknown for her charitable work and global influence."
                    37 -> message = "You are 37 years old, which is the same age as Vincent van Gogh.\nVincent van Gogh was a Dutch post-impressionist painter whose work is known for its emotional intensity and bold colors."
                    47 -> message = "You are 47 years old, which is the same age as Frida Kahlo. Frida\nKahlo was a Mexican artist known for her self-portraits and works inspired by Mexican culture and folklore."
                    52 -> message = "You are 52 years old, which is the same age as William Shakespeare.\nWilliam Shakespeare was an iconic English playwright and poet,\nregarded as one of the greatest writers in the English language."
                    56 -> message = "You are 56 years old, which is the same age as Julius Caesar.\nJulius Caesar was a Roman general and statesman who played a critical role in the demise of the Roman Republic and the rise of the Roman Empire."
                    61 -> message = "You are 61 years old, which is the same age as Ernest Hemingway.\nErnest Hemingway was an American novelist and short-story writer,\nknown for his distinct writing style and works such as 'The Old Man and the Sea' and 'A Farewell to Arms'."
                    66 -> message = "You are 66 years old, which is the same age as Marie Curie.\nMarie Curie was a Nobel Prize-winning physicist and chemist,\nknown for her pioneering research on radioactivity."
                    67 -> message = "You are 67 years old, which is the same age as Leonardo da Vinci.\nLeonardo da Vinci was a renowned Italian polymath known for his contributions to art,\nscience, and engineering."
                    70 -> message = "You are 70 years old, which is the same age as Socrates.\nSocrates was an ancient Greek philosopher,\nconsidered one of the founders of Western philosophy."
                    73 -> message = "You are 73 years old, which is the same age as Alexander Fleming.\nAlexander Fleming was a Scottish biologist and pharmacologist,\ndiscovered penicillin."
                    81 -> message = "You are 81 years old, which is the same age as Queen Victoria.\nQueen Victoria was the long-reigning monarch of the United Kingdom during the Victorian era."
                    84 -> message = "You are 84 years old, which is the same age as Isaac Newton.\nIsaac Newton was an English mathematician and physicist,\nrecognized for his laws of motion and universal gravitation."
                    87 -> message = "You are 87 years old, which is the same age as Mother Teresa.\nMother Teresa was an Albanian-Indian Roman Catholic nun and missionary,\nknown for her humanitarian work with the poor and sick."
                    90 -> message = "You are 90 years old, which is the same age as Winston Churchill.\nWinston Churchill was a British statesman and Prime Minister during World War II,\nknown for his leadership and oratory skills."
                    91 -> message = "You are 91 years old, which is the same age as Pablo Picasso.\nPablo Picasso was a Spanish painter, sculptor,\nand co-founder of the Cubist movement."
                    95 -> message = "You are 95 years old, which is the same age as Nelson Mandela.\nNelson Mandela was an anti-apartheid revolutionary and former President of South Africa,\nknown for his efforts to end racial segregation."
                    //110 -> message = "You are 110 years old, which is the same age as Jeanne Calment.\nJeanne Calment was a French supercentenarian,\nholding the record for the longest confirmed human lifespan."
                    else -> message = "There is no historical figure known to be ${age} years old!" //
                }
                tvResult.text = message // display the results based on the user's input
            }
        }
    }
}