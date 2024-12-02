package vn.edu.hust.studentman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import vn.edu.hust.studentman.databinding.FragmentAddStudentBinding

class AddStudentFragment : Fragment() {

    private var _binding: FragmentAddStudentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddStudentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Xử lý nút thêm sinh viên
        binding.btnAddStudent.setOnClickListener {
            // Thêm logic xử lý ở đây, ví dụ như thêm sinh viên vào danh sách
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
