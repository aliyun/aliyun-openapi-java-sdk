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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.ListClassesResponse;
import com.aliyuncs.rds.model.v20140815.ListClassesResponse.ClassList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClassesResponseUnmarshaller {

	public static ListClassesResponse unmarshall(ListClassesResponse listClassesResponse, UnmarshallerContext _ctx) {
		
		listClassesResponse.setRequestId(_ctx.stringValue("ListClassesResponse.RequestId"));
		listClassesResponse.setRegionId(_ctx.stringValue("ListClassesResponse.RegionId"));

		List<ClassList> items = new ArrayList<ClassList>();
		for (int i = 0; i < _ctx.lengthValue("ListClassesResponse.Items.Length"); i++) {
			ClassList classList = new ClassList();
			classList.setMaxIOPS(_ctx.stringValue("ListClassesResponse.Items["+ i +"].MaxIOPS"));
			classList.setCpu(_ctx.stringValue("ListClassesResponse.Items["+ i +"].Cpu"));
			classList.setReferencePrice(_ctx.stringValue("ListClassesResponse.Items["+ i +"].ReferencePrice"));
			classList.setMaxConnections(_ctx.stringValue("ListClassesResponse.Items["+ i +"].MaxConnections"));
			classList.setMemoryClass(_ctx.stringValue("ListClassesResponse.Items["+ i +"].MemoryClass"));
			classList.setClassCode(_ctx.stringValue("ListClassesResponse.Items["+ i +"].ClassCode"));
			classList.setClassGroup(_ctx.stringValue("ListClassesResponse.Items["+ i +"].ClassGroup"));
			classList.setMaxIOMBPS(_ctx.stringValue("ListClassesResponse.Items["+ i +"].MaxIOMBPS"));

			items.add(classList);
		}
		listClassesResponse.setItems(items);
	 
	 	return listClassesResponse;
	}
}