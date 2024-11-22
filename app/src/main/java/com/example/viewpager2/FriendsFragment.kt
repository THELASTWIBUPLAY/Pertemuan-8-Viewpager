package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager2.R.layout.fragment_friends

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FriendsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FriendsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var friendAdapter: MyFriendAdapter
    private val friends = mutableListOf<MyFriend>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(fragment_friends, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        setupRecyclerView()
        return view
    }


    private fun setupRecyclerView() {
        friends.addAll(
            listOf(
                MyFriend(name = "Rusdi", phone = "086969696969", email = "rusdibarber@email.com"),
                MyFriend(name = "Pak Amba", phone = "081029384756", email = "ambalabu@gmail.com"),
                MyFriend(name = "Xin Fu Tang", phone = "080912873475", email = "xawangxinawang@gmail.com"),
                MyFriend(name = "Si Imut", phone = "082947563810", email = "uwu@email.com"),
                MyFriend(name = "Dimas Hotwil", phone = "080987654321", email = "hotwildimas@gmail.com"),
                MyFriend(name = "Cak Dono Polo", phone = "081234567890", email = "linggaguliguliwaca@gmail.com"),
                MyFriend(name = "Ambasing", phone = "086969696969", email = "singingamba@email.com"),
                MyFriend(name = "Sungut Lele", phone = "081029384756", email = "lele@gmail.com"),
                MyFriend(name = "Coklat NIGGERia", phone = "080912873475", email = "alamak@gmail.com")
            )
        )
        friendAdapter = MyFriendAdapter(friends)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = friendAdapter
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FriendsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FriendsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}