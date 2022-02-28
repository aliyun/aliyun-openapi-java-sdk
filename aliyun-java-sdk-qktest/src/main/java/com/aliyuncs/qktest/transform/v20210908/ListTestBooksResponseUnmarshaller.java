/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.qktest.transform.v20210908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qktest.model.v20210908.ListTestBooksResponse;
import com.aliyuncs.qktest.model.v20210908.ListTestBooksResponse.TestBook;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTestBooksResponseUnmarshaller {

	public static ListTestBooksResponse unmarshall(ListTestBooksResponse listTestBooksResponse, UnmarshallerContext _ctx) {
		
		listTestBooksResponse.setRequestId(_ctx.stringValue("ListTestBooksResponse.RequestId"));
		listTestBooksResponse.setTotalCount(_ctx.integerValue("ListTestBooksResponse.TotalCount"));
		listTestBooksResponse.setNextToken(_ctx.integerValue("ListTestBooksResponse.NextToken"));

		List<TestBook> testBooks = new ArrayList<TestBook>();
		for (int i = 0; i < _ctx.lengthValue("ListTestBooksResponse.TestBooks.Length"); i++) {
			TestBook testBook = new TestBook();
			testBook.setResourceGroupId(_ctx.stringValue("ListTestBooksResponse.TestBooks["+ i +"].ResourceGroupId"));
			testBook.setCreateTime(_ctx.stringValue("ListTestBooksResponse.TestBooks["+ i +"].CreateTime"));
			testBook.setTestBookId(_ctx.stringValue("ListTestBooksResponse.TestBooks["+ i +"].TestBookId"));
			testBook.setTestBookName(_ctx.stringValue("ListTestBooksResponse.TestBooks["+ i +"].TestBookName"));

			testBooks.add(testBook);
		}
		listTestBooksResponse.setTestBooks(testBooks);
	 
	 	return listTestBooksResponse;
	}
}