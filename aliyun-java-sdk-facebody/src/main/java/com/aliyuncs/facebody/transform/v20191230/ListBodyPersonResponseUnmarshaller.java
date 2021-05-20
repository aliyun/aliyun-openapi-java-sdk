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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.ListBodyPersonResponse;
import com.aliyuncs.facebody.model.v20191230.ListBodyPersonResponse.Data;
import com.aliyuncs.facebody.model.v20191230.ListBodyPersonResponse.Data.Person;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBodyPersonResponseUnmarshaller {

	public static ListBodyPersonResponse unmarshall(ListBodyPersonResponse listBodyPersonResponse, UnmarshallerContext _ctx) {
		
		listBodyPersonResponse.setRequestId(_ctx.stringValue("ListBodyPersonResponse.RequestId"));
		listBodyPersonResponse.setCode(_ctx.stringValue("ListBodyPersonResponse.Code"));
		listBodyPersonResponse.setMessage(_ctx.stringValue("ListBodyPersonResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListBodyPersonResponse.Data.Total"));

		List<Person> personList = new ArrayList<Person>();
		for (int i = 0; i < _ctx.lengthValue("ListBodyPersonResponse.Data.PersonList.Length"); i++) {
			Person person = new Person();
			person.setInstanceId(_ctx.longValue("ListBodyPersonResponse.Data.PersonList["+ i +"].InstanceId"));
			person.setDbId(_ctx.longValue("ListBodyPersonResponse.Data.PersonList["+ i +"].DbId"));
			person.setName(_ctx.stringValue("ListBodyPersonResponse.Data.PersonList["+ i +"].Name"));
			person.setTraceCount(_ctx.longValue("ListBodyPersonResponse.Data.PersonList["+ i +"].TraceCount"));
			person.setId(_ctx.longValue("ListBodyPersonResponse.Data.PersonList["+ i +"].Id"));

			personList.add(person);
		}
		data.setPersonList(personList);
		listBodyPersonResponse.setData(data);
	 
	 	return listBodyPersonResponse;
	}
}