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

import com.aliyuncs.oos.model.v20190601.UpdateOpsItemResponse;
import com.aliyuncs.oos.model.v20190601.UpdateOpsItemResponse.OpsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateOpsItemResponseUnmarshaller {

	public static UpdateOpsItemResponse unmarshall(UpdateOpsItemResponse updateOpsItemResponse, UnmarshallerContext _ctx) {
		
		updateOpsItemResponse.setRequestId(_ctx.stringValue("UpdateOpsItemResponse.RequestId"));

		OpsItem opsItem = new OpsItem();
		opsItem.setTags(_ctx.mapValue("UpdateOpsItemResponse.OpsItem.Tags"));
		opsItem.setUpdateDate(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.UpdateDate"));
		opsItem.setDescription(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.Description"));
		opsItem.setOpsItemId(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.OpsItemId"));
		opsItem.setCreateDate(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.CreateDate"));
		opsItem.setTitle(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.Title"));
		opsItem.setStatus(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.Status"));
		opsItem.setSeverity(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.Severity"));
		opsItem.setCategory(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.Category"));
		opsItem.setSource(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.Source"));
		opsItem.setPriority(_ctx.integerValue("UpdateOpsItemResponse.OpsItem.Priority"));
		opsItem.setAttributes(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.Attributes"));
		opsItem.setCreatedBy(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.CreatedBy"));
		opsItem.setLastModifiedBy(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.LastModifiedBy"));
		opsItem.setResourceGroupId(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.ResourceGroupId"));

		List<String> solutions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateOpsItemResponse.OpsItem.Solutions.Length"); i++) {
			solutions.add(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.Solutions["+ i +"]"));
		}
		opsItem.setSolutions(solutions);

		List<String> resources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateOpsItemResponse.OpsItem.Resources.Length"); i++) {
			resources.add(_ctx.stringValue("UpdateOpsItemResponse.OpsItem.Resources["+ i +"]"));
		}
		opsItem.setResources(resources);
		updateOpsItemResponse.setOpsItem(opsItem);
	 
	 	return updateOpsItemResponse;
	}
}