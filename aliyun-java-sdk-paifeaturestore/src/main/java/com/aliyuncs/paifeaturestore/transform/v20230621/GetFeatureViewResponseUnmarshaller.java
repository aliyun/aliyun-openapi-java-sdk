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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.GetFeatureViewResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.GetFeatureViewResponse.FieldsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFeatureViewResponseUnmarshaller {

	public static GetFeatureViewResponse unmarshall(GetFeatureViewResponse getFeatureViewResponse, UnmarshallerContext _ctx) {
		
		getFeatureViewResponse.setRequestId(_ctx.stringValue("GetFeatureViewResponse.RequestId"));
		getFeatureViewResponse.setProjectId(_ctx.stringValue("GetFeatureViewResponse.ProjectId"));
		getFeatureViewResponse.setProjectName(_ctx.stringValue("GetFeatureViewResponse.ProjectName"));
		getFeatureViewResponse.setFeatureEntityName(_ctx.stringValue("GetFeatureViewResponse.FeatureEntityName"));
		getFeatureViewResponse.setName(_ctx.stringValue("GetFeatureViewResponse.Name"));
		getFeatureViewResponse.setOwner(_ctx.stringValue("GetFeatureViewResponse.Owner"));
		getFeatureViewResponse.setType(_ctx.stringValue("GetFeatureViewResponse.Type"));
		getFeatureViewResponse.setGmtCreateTime(_ctx.stringValue("GetFeatureViewResponse.GmtCreateTime"));
		getFeatureViewResponse.setGmtModifiedTime(_ctx.stringValue("GetFeatureViewResponse.GmtModifiedTime"));
		getFeatureViewResponse.setFeatureEntityId(_ctx.stringValue("GetFeatureViewResponse.FeatureEntityId"));
		getFeatureViewResponse.setJoinId(_ctx.stringValue("GetFeatureViewResponse.JoinId"));
		getFeatureViewResponse.setWriteMethod(_ctx.stringValue("GetFeatureViewResponse.WriteMethod"));
		getFeatureViewResponse.setRegisterTable(_ctx.stringValue("GetFeatureViewResponse.RegisterTable"));
		getFeatureViewResponse.setRegisterDatasourceId(_ctx.stringValue("GetFeatureViewResponse.RegisterDatasourceId"));
		getFeatureViewResponse.setRegisterDatasourceName(_ctx.stringValue("GetFeatureViewResponse.RegisterDatasourceName"));
		getFeatureViewResponse.setWriteToFeatureDB(_ctx.booleanValue("GetFeatureViewResponse.WriteToFeatureDB"));
		getFeatureViewResponse.setSyncOnlineTable(_ctx.booleanValue("GetFeatureViewResponse.SyncOnlineTable"));
		getFeatureViewResponse.setTTL(_ctx.integerValue("GetFeatureViewResponse.TTL"));
		getFeatureViewResponse.setConfig(_ctx.stringValue("GetFeatureViewResponse.Config"));
		getFeatureViewResponse.setGmtSyncTime(_ctx.stringValue("GetFeatureViewResponse.GmtSyncTime"));
		getFeatureViewResponse.setLastSyncConfig(_ctx.stringValue("GetFeatureViewResponse.LastSyncConfig"));
		getFeatureViewResponse.setPublishTableScript(_ctx.stringValue("GetFeatureViewResponse.PublishTableScript"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureViewResponse.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("GetFeatureViewResponse.Tags["+ i +"]"));
		}
		getFeatureViewResponse.setTags(tags);

		List<FieldsItem> fields = new ArrayList<FieldsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureViewResponse.Fields.Length"); i++) {
			FieldsItem fieldsItem = new FieldsItem();
			fieldsItem.setName(_ctx.stringValue("GetFeatureViewResponse.Fields["+ i +"].Name"));
			fieldsItem.setType(_ctx.stringValue("GetFeatureViewResponse.Fields["+ i +"].Type"));

			List<String> attributes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetFeatureViewResponse.Fields["+ i +"].Attributes.Length"); j++) {
				attributes.add(_ctx.stringValue("GetFeatureViewResponse.Fields["+ i +"].Attributes["+ j +"]"));
			}
			fieldsItem.setAttributes(attributes);

			fields.add(fieldsItem);
		}
		getFeatureViewResponse.setFields(fields);
	 
	 	return getFeatureViewResponse;
	}
}