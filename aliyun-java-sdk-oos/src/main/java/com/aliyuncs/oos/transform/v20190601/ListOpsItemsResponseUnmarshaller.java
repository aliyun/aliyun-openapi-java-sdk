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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListOpsItemsResponse;
import com.aliyuncs.oos.model.v20190601.ListOpsItemsResponse.OpsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOpsItemsResponseUnmarshaller {

	public static ListOpsItemsResponse unmarshall(ListOpsItemsResponse listOpsItemsResponse, UnmarshallerContext _ctx) {
		
		listOpsItemsResponse.setRequestId(_ctx.stringValue("ListOpsItemsResponse.RequestId"));
		listOpsItemsResponse.setNextToken(_ctx.stringValue("ListOpsItemsResponse.NextToken"));
		listOpsItemsResponse.setMaxResults(_ctx.integerValue("ListOpsItemsResponse.MaxResults"));
		listOpsItemsResponse.setTotalCount(_ctx.integerValue("ListOpsItemsResponse.TotalCount"));

		List<OpsItem> opsItems = new ArrayList<OpsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListOpsItemsResponse.OpsItems.Length"); i++) {
			OpsItem opsItem = new OpsItem();
			opsItem.setOpsItemId(_ctx.stringValue("ListOpsItemsResponse.OpsItems["+ i +"].OpsItemId"));
			opsItem.setCreateDate(_ctx.stringValue("ListOpsItemsResponse.OpsItems["+ i +"].CreateDate"));
			opsItem.setUpdateDate(_ctx.stringValue("ListOpsItemsResponse.OpsItems["+ i +"].UpdateDate"));
			opsItem.setTitle(_ctx.stringValue("ListOpsItemsResponse.OpsItems["+ i +"].Title"));
			opsItem.setStatus(_ctx.stringValue("ListOpsItemsResponse.OpsItems["+ i +"].Status"));
			opsItem.setSeverity(_ctx.stringValue("ListOpsItemsResponse.OpsItems["+ i +"].Severity"));
			opsItem.setCategory(_ctx.stringValue("ListOpsItemsResponse.OpsItems["+ i +"].Category"));
			opsItem.setSource(_ctx.stringValue("ListOpsItemsResponse.OpsItems["+ i +"].Source"));
			opsItem.setPriority(_ctx.integerValue("ListOpsItemsResponse.OpsItems["+ i +"].Priority"));
			opsItem.setTags(_ctx.mapValue("ListOpsItemsResponse.OpsItems["+ i +"].Tags"));

			List<String> resources = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListOpsItemsResponse.OpsItems["+ i +"].Resources.Length"); j++) {
				resources.add(_ctx.stringValue("ListOpsItemsResponse.OpsItems["+ i +"].Resources["+ j +"]"));
			}
			opsItem.setResources(resources);

			opsItems.add(opsItem);
		}
		listOpsItemsResponse.setOpsItems(opsItems);
	 
	 	return listOpsItemsResponse;
	}
}