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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerGroupFindDefaultSystemGroupResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupFindDefaultSystemGroupResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupFindDefaultSystemGroupResponse.Data.Tag;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupFindDefaultSystemGroupResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGroupFindDefaultSystemGroupResponseUnmarshaller {

	public static InnerGroupFindDefaultSystemGroupResponse unmarshall(InnerGroupFindDefaultSystemGroupResponse innerGroupFindDefaultSystemGroupResponse, UnmarshallerContext context) {
		
		innerGroupFindDefaultSystemGroupResponse.setRequestId(context.stringValue("InnerGroupFindDefaultSystemGroupResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerGroupFindDefaultSystemGroupResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerGroupFindDefaultSystemGroupResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerGroupFindDefaultSystemGroupResponse.errorCode.isSuccess"));
		innerGroupFindDefaultSystemGroupResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setEcsCount(context.integerValue("InnerGroupFindDefaultSystemGroupResponse.data.ecsCount"));
		data.setGmtModified(context.stringValue("InnerGroupFindDefaultSystemGroupResponse.data.gmtModified"));
		data.setGroupNo(context.stringValue("InnerGroupFindDefaultSystemGroupResponse.data.groupNo"));
		data.setGmtCreated(context.stringValue("InnerGroupFindDefaultSystemGroupResponse.data.gmtCreated"));
		data.setGroupName(context.stringValue("InnerGroupFindDefaultSystemGroupResponse.data.groupName"));
		data.setGroupDesc(context.stringValue("InnerGroupFindDefaultSystemGroupResponse.data.groupDesc"));
		data.setVpcInstanceId(context.stringValue("InnerGroupFindDefaultSystemGroupResponse.data.vpcInstanceId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("InnerGroupFindDefaultSystemGroupResponse.data.tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(context.stringValue("InnerGroupFindDefaultSystemGroupResponse.data.tags["+ i +"].key"));
			tag.setValue(context.stringValue("InnerGroupFindDefaultSystemGroupResponse.data.tags["+ i +"].value"));

			tags.add(tag);
		}
		data.setTags(tags);
		innerGroupFindDefaultSystemGroupResponse.setData(data);
	 
	 	return innerGroupFindDefaultSystemGroupResponse;
	}
}