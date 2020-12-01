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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.ListCommonGroupResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListCommonGroupResponse.CommonGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCommonGroupResponseUnmarshaller {

	public static ListCommonGroupResponse unmarshall(ListCommonGroupResponse listCommonGroupResponse, UnmarshallerContext _ctx) {
		
		listCommonGroupResponse.setRequestId(_ctx.stringValue("ListCommonGroupResponse.RequestId"));
		listCommonGroupResponse.setSuccessful(_ctx.booleanValue("ListCommonGroupResponse.Successful"));
		listCommonGroupResponse.setErrorCode(_ctx.stringValue("ListCommonGroupResponse.ErrorCode"));
		listCommonGroupResponse.setErrorMsg(_ctx.stringValue("ListCommonGroupResponse.ErrorMsg"));

		List<CommonGroup> object = new ArrayList<CommonGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListCommonGroupResponse.Object.Length"); i++) {
			CommonGroup commonGroup = new CommonGroup();
			commonGroup.setPinyin(_ctx.stringValue("ListCommonGroupResponse.Object["+ i +"].Pinyin"));
			commonGroup.setIsRoot(_ctx.booleanValue("ListCommonGroupResponse.Object["+ i +"].IsRoot"));
			commonGroup.setPos(_ctx.integerValue("ListCommonGroupResponse.Object["+ i +"].Pos"));
			commonGroup.setResourceCount(_ctx.integerValue("ListCommonGroupResponse.Object["+ i +"].ResourceCount"));
			commonGroup.setName(_ctx.stringValue("ListCommonGroupResponse.Object["+ i +"].Name"));
			commonGroup.setCreatorId(_ctx.stringValue("ListCommonGroupResponse.Object["+ i +"].CreatorId"));
			commonGroup.setSmartGroupId(_ctx.stringValue("ListCommonGroupResponse.Object["+ i +"].SmartGroupId"));
			commonGroup.setProjectId(_ctx.stringValue("ListCommonGroupResponse.Object["+ i +"].ProjectId"));
			commonGroup.setId(_ctx.stringValue("ListCommonGroupResponse.Object["+ i +"].id"));

			object.add(commonGroup);
		}
		listCommonGroupResponse.setObject(object);
	 
	 	return listCommonGroupResponse;
	}
}