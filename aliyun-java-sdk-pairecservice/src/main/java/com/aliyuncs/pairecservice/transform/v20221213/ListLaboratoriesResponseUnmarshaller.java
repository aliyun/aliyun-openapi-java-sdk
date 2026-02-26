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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListLaboratoriesResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListLaboratoriesResponse.LaboratoriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLaboratoriesResponseUnmarshaller {

	public static ListLaboratoriesResponse unmarshall(ListLaboratoriesResponse listLaboratoriesResponse, UnmarshallerContext _ctx) {
		
		listLaboratoriesResponse.setRequestId(_ctx.stringValue("ListLaboratoriesResponse.RequestId"));
		listLaboratoriesResponse.setTotalCount(_ctx.longValue("ListLaboratoriesResponse.TotalCount"));

		List<LaboratoriesItem> laboratories = new ArrayList<LaboratoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLaboratoriesResponse.Laboratories.Length"); i++) {
			LaboratoriesItem laboratoriesItem = new LaboratoriesItem();
			laboratoriesItem.setLaboratoryId(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].LaboratoryId"));
			laboratoriesItem.setSceneId(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].SceneId"));
			laboratoriesItem.setName(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].Name"));
			laboratoriesItem.setDescription(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].Description"));
			laboratoriesItem.setDebugUsers(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].DebugUsers"));
			laboratoriesItem.setDebugCrowdId(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].DebugCrowdId"));
			laboratoriesItem.setBucketCount(_ctx.integerValue("ListLaboratoriesResponse.Laboratories["+ i +"].BucketCount"));
			laboratoriesItem.setBuckets(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].Buckets"));
			laboratoriesItem.setBucketType(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].BucketType"));
			laboratoriesItem.setFilter(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].Filter"));
			laboratoriesItem.setEnvironment(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].Environment"));
			laboratoriesItem.setType(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].Type"));
			laboratoriesItem.setStatus(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].Status"));
			laboratoriesItem.setCrowdId(_ctx.stringValue("ListLaboratoriesResponse.Laboratories["+ i +"].CrowdId"));

			laboratories.add(laboratoriesItem);
		}
		listLaboratoriesResponse.setLaboratories(laboratories);
	 
	 	return listLaboratoriesResponse;
	}
}