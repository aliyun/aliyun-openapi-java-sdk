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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitivityLevelResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitivityLevelResponse.SensitivityLevelListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSensitivityLevelResponseUnmarshaller {

	public static ListSensitivityLevelResponse unmarshall(ListSensitivityLevelResponse listSensitivityLevelResponse, UnmarshallerContext _ctx) {
		
		listSensitivityLevelResponse.setRequestId(_ctx.stringValue("ListSensitivityLevelResponse.RequestId"));
		listSensitivityLevelResponse.setSuccess(_ctx.booleanValue("ListSensitivityLevelResponse.Success"));
		listSensitivityLevelResponse.setErrorMessage(_ctx.stringValue("ListSensitivityLevelResponse.ErrorMessage"));
		listSensitivityLevelResponse.setErrorCode(_ctx.stringValue("ListSensitivityLevelResponse.ErrorCode"));

		List<SensitivityLevelListItem> sensitivityLevelList = new ArrayList<SensitivityLevelListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSensitivityLevelResponse.SensitivityLevelList.Length"); i++) {
			SensitivityLevelListItem sensitivityLevelListItem = new SensitivityLevelListItem();
			sensitivityLevelListItem.setName(_ctx.stringValue("ListSensitivityLevelResponse.SensitivityLevelList["+ i +"].Name"));
			sensitivityLevelListItem.setTemplateId(_ctx.stringValue("ListSensitivityLevelResponse.SensitivityLevelList["+ i +"].TemplateId"));
			sensitivityLevelListItem.setTemplateType(_ctx.stringValue("ListSensitivityLevelResponse.SensitivityLevelList["+ i +"].TemplateType"));
			sensitivityLevelListItem.setIsPlain(_ctx.booleanValue("ListSensitivityLevelResponse.SensitivityLevelList["+ i +"].IsPlain"));

			sensitivityLevelList.add(sensitivityLevelListItem);
		}
		listSensitivityLevelResponse.setSensitivityLevelList(sensitivityLevelList);
	 
	 	return listSensitivityLevelResponse;
	}
}