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

import com.aliyuncs.ecsinc.model.v20160314.InnerGroupQueryResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupQueryResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupQueryResponse.Data.Group;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupQueryResponse.Data.Group.Tag;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupQueryResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGroupQueryResponseUnmarshaller {

	public static InnerGroupQueryResponse unmarshall(InnerGroupQueryResponse innerGroupQueryResponse, UnmarshallerContext context) {
		
		innerGroupQueryResponse.setRequestId(context.stringValue("InnerGroupQueryResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerGroupQueryResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerGroupQueryResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerGroupQueryResponse.errorCode.isSuccess"));
		innerGroupQueryResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setTotal(context.integerValue("InnerGroupQueryResponse.data.total"));
		data.setVpcInstanceId(context.stringValue("InnerGroupQueryResponse.data.vpcInstanceId"));
		data.setPageNo(context.integerValue("InnerGroupQueryResponse.data.pageNo"));
		data.setPageSize(context.integerValue("InnerGroupQueryResponse.data.pageSize"));
		data.setRegionNo(context.stringValue("InnerGroupQueryResponse.data.regionNo"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < context.lengthValue("InnerGroupQueryResponse.data.groups.Length"); i++) {
			Group group = new Group();
			group.setEcsCount(context.integerValue("InnerGroupQueryResponse.data.groups["+ i +"].ecsCount"));
			group.setVpcInstanceId(context.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].vpcInstanceId"));
			group.setGroupDesc(context.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].groupDesc"));
			group.setGmtCreated(context.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].gmtCreated"));
			group.setGroupName(context.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].groupName"));
			group.setGmtModified(context.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].gmtModified"));
			group.setGroupNo(context.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].groupNo"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("InnerGroupQueryResponse.data.groups["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].tags["+ j +"].key"));
				tag.setValue(context.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			group.setTags(tags);

			groups.add(group);
		}
		data.setGroups(groups);
		innerGroupQueryResponse.setData(data);
	 
	 	return innerGroupQueryResponse;
	}
}