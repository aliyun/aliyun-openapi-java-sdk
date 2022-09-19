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

import com.aliyuncs.oos.model.v20190601.GetOpsItemResponse;
import com.aliyuncs.oos.model.v20190601.GetOpsItemResponse.OpsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOpsItemResponseUnmarshaller {

	public static GetOpsItemResponse unmarshall(GetOpsItemResponse getOpsItemResponse, UnmarshallerContext _ctx) {
		
		getOpsItemResponse.setRequestId(_ctx.stringValue("GetOpsItemResponse.RequestId"));

		OpsItem opsItem = new OpsItem();
		opsItem.setOpsItemId(_ctx.stringValue("GetOpsItemResponse.OpsItem.OpsItemId"));
		opsItem.setCreateDate(_ctx.stringValue("GetOpsItemResponse.OpsItem.CreateDate"));
		opsItem.setUpdateDate(_ctx.stringValue("GetOpsItemResponse.OpsItem.UpdateDate"));
		opsItem.setTitle(_ctx.stringValue("GetOpsItemResponse.OpsItem.Title"));
		opsItem.setStatus(_ctx.stringValue("GetOpsItemResponse.OpsItem.Status"));
		opsItem.setSeverity(_ctx.stringValue("GetOpsItemResponse.OpsItem.Severity"));
		opsItem.setCategory(_ctx.stringValue("GetOpsItemResponse.OpsItem.Category"));
		opsItem.setSource(_ctx.stringValue("GetOpsItemResponse.OpsItem.Source"));
		opsItem.setPriority(_ctx.integerValue("GetOpsItemResponse.OpsItem.Priority"));
		opsItem.setTags(_ctx.mapValue("GetOpsItemResponse.OpsItem.Tags"));
		opsItem.setDedupString(_ctx.stringValue("GetOpsItemResponse.OpsItem.DedupString"));
		opsItem.setResourceGroupId(_ctx.stringValue("GetOpsItemResponse.OpsItem.ResourceGroupId"));
		opsItem.setDescription(_ctx.stringValue("GetOpsItemResponse.OpsItem.Description"));
		opsItem.setCreateBy(_ctx.stringValue("GetOpsItemResponse.OpsItem.CreateBy"));
		opsItem.setLastModifiedBy(_ctx.stringValue("GetOpsItemResponse.OpsItem.LastModifiedBy"));
		opsItem.setAttributes(_ctx.mapValue("GetOpsItemResponse.OpsItem.Attributes"));

		List<Map<Object, Object>> solutions = _ctx.listMapValue("GetOpsItemResponse.OpsItem.Solutions");
		opsItem.setSolutions(solutions);

		List<String> resources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOpsItemResponse.OpsItem.Resources.Length"); i++) {
			resources.add(_ctx.stringValue("GetOpsItemResponse.OpsItem.Resources["+ i +"]"));
		}
		opsItem.setResources(resources);
		getOpsItemResponse.setOpsItem(opsItem);
	 
	 	return getOpsItemResponse;
	}
}