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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListProjectIdsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectIdsResponseUnmarshaller {

	public static ListProjectIdsResponse unmarshall(ListProjectIdsResponse listProjectIdsResponse, UnmarshallerContext _ctx) {
		
		listProjectIdsResponse.setRequestId(_ctx.stringValue("ListProjectIdsResponse.RequestId"));

		List<Long> projectIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectIdsResponse.ProjectIds.Length"); i++) {
			projectIds.add(_ctx.longValue("ListProjectIdsResponse.ProjectIds["+ i +"]"));
		}
		listProjectIdsResponse.setProjectIds(projectIds);
	 
	 	return listProjectIdsResponse;
	}
}