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

import com.aliyuncs.paifeaturestore.model.v20230621.GetProjectFeatureViewResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.GetProjectFeatureViewResponse.FieldsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectFeatureViewResponseUnmarshaller {

	public static GetProjectFeatureViewResponse unmarshall(GetProjectFeatureViewResponse getProjectFeatureViewResponse, UnmarshallerContext _ctx) {
		
		getProjectFeatureViewResponse.setRequestId(_ctx.stringValue("GetProjectFeatureViewResponse.RequestId"));
		getProjectFeatureViewResponse.setFeatureViewId(_ctx.stringValue("GetProjectFeatureViewResponse.FeatureViewId"));
		getProjectFeatureViewResponse.setProjectId(_ctx.stringValue("GetProjectFeatureViewResponse.ProjectId"));
		getProjectFeatureViewResponse.setProjectName(_ctx.stringValue("GetProjectFeatureViewResponse.ProjectName"));
		getProjectFeatureViewResponse.setFeatureEntityId(_ctx.stringValue("GetProjectFeatureViewResponse.FeatureEntityId"));
		getProjectFeatureViewResponse.setFeatureEntityName(_ctx.stringValue("GetProjectFeatureViewResponse.FeatureEntityName"));
		getProjectFeatureViewResponse.setJoinId(_ctx.stringValue("GetProjectFeatureViewResponse.JoinId"));
		getProjectFeatureViewResponse.setName(_ctx.stringValue("GetProjectFeatureViewResponse.Name"));
		getProjectFeatureViewResponse.setOwner(_ctx.stringValue("GetProjectFeatureViewResponse.Owner"));
		getProjectFeatureViewResponse.setType(_ctx.stringValue("GetProjectFeatureViewResponse.Type"));
		getProjectFeatureViewResponse.setWriteMethod(_ctx.stringValue("GetProjectFeatureViewResponse.WriteMethod"));
		getProjectFeatureViewResponse.setRegisterTable(_ctx.stringValue("GetProjectFeatureViewResponse.RegisterTable"));
		getProjectFeatureViewResponse.setRegisterDatasourceId(_ctx.stringValue("GetProjectFeatureViewResponse.RegisterDatasourceId"));
		getProjectFeatureViewResponse.setSyncOnlineTable(_ctx.booleanValue("GetProjectFeatureViewResponse.SyncOnlineTable"));
		getProjectFeatureViewResponse.setTTL(_ctx.integerValue("GetProjectFeatureViewResponse.TTL"));
		getProjectFeatureViewResponse.setConfig(_ctx.stringValue("GetProjectFeatureViewResponse.Config"));
		getProjectFeatureViewResponse.setGmtSyncTime(_ctx.stringValue("GetProjectFeatureViewResponse.GmtSyncTime"));
		getProjectFeatureViewResponse.setLastSyncConfig(_ctx.stringValue("GetProjectFeatureViewResponse.LastSyncConfig"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectFeatureViewResponse.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("GetProjectFeatureViewResponse.Tags["+ i +"]"));
		}
		getProjectFeatureViewResponse.setTags(tags);

		List<FieldsItem> fields = new ArrayList<FieldsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectFeatureViewResponse.Fields.Length"); i++) {
			FieldsItem fieldsItem = new FieldsItem();
			fieldsItem.setName(_ctx.stringValue("GetProjectFeatureViewResponse.Fields["+ i +"].Name"));
			fieldsItem.setType(_ctx.stringValue("GetProjectFeatureViewResponse.Fields["+ i +"].Type"));

			List<String> attributes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetProjectFeatureViewResponse.Fields["+ i +"].Attributes.Length"); j++) {
				attributes.add(_ctx.stringValue("GetProjectFeatureViewResponse.Fields["+ i +"].Attributes["+ j +"]"));
			}
			fieldsItem.setAttributes(attributes);

			fields.add(fieldsItem);
		}
		getProjectFeatureViewResponse.setFields(fields);
	 
	 	return getProjectFeatureViewResponse;
	}
}