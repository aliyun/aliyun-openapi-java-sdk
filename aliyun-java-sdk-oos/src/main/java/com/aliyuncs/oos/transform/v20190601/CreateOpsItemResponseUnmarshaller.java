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

import com.aliyuncs.oos.model.v20190601.CreateOpsItemResponse;
import com.aliyuncs.oos.model.v20190601.CreateOpsItemResponse.OpsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOpsItemResponseUnmarshaller {

	public static CreateOpsItemResponse unmarshall(CreateOpsItemResponse createOpsItemResponse, UnmarshallerContext _ctx) {
		
		createOpsItemResponse.setRequestId(_ctx.stringValue("CreateOpsItemResponse.RequestId"));

		OpsItem opsItem = new OpsItem();
		opsItem.setTags(_ctx.mapValue("CreateOpsItemResponse.OpsItem.Tags"));
		opsItem.setUpdateDate(_ctx.stringValue("CreateOpsItemResponse.OpsItem.UpdateDate"));
		opsItem.setDescription(_ctx.stringValue("CreateOpsItemResponse.OpsItem.Description"));
		opsItem.setOpsItemId(_ctx.stringValue("CreateOpsItemResponse.OpsItem.OpsItemId"));
		opsItem.setCreateDate(_ctx.stringValue("CreateOpsItemResponse.OpsItem.CreateDate"));
		opsItem.setTitle(_ctx.stringValue("CreateOpsItemResponse.OpsItem.Title"));
		opsItem.setStatus(_ctx.stringValue("CreateOpsItemResponse.OpsItem.Status"));
		opsItem.setSeverity(_ctx.stringValue("CreateOpsItemResponse.OpsItem.Severity"));
		opsItem.setCategory(_ctx.stringValue("CreateOpsItemResponse.OpsItem.Category"));
		opsItem.setSource(_ctx.stringValue("CreateOpsItemResponse.OpsItem.Source"));
		opsItem.setPriority(_ctx.integerValue("CreateOpsItemResponse.OpsItem.Priority"));
		opsItem.setSolutions(_ctx.stringValue("CreateOpsItemResponse.OpsItem.Solutions"));
		opsItem.setResources(_ctx.stringValue("CreateOpsItemResponse.OpsItem.Resources"));
		opsItem.setAttributes(_ctx.stringValue("CreateOpsItemResponse.OpsItem.Attributes"));
		opsItem.setCreatedBy(_ctx.stringValue("CreateOpsItemResponse.OpsItem.CreatedBy"));
		opsItem.setLastModifiedBy(_ctx.stringValue("CreateOpsItemResponse.OpsItem.LastModifiedBy"));
		opsItem.setResourceGroupId(_ctx.stringValue("CreateOpsItemResponse.OpsItem.ResourceGroupId"));
		createOpsItemResponse.setOpsItem(opsItem);
	 
	 	return createOpsItemResponse;
	}
}