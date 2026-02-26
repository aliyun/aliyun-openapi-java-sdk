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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeParameterGroupSupportParamResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeParameterGroupSupportParamResponse.ResourceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterGroupSupportParamResponseUnmarshaller {

	public static DescribeParameterGroupSupportParamResponse unmarshall(DescribeParameterGroupSupportParamResponse describeParameterGroupSupportParamResponse, UnmarshallerContext _ctx) {
		
		describeParameterGroupSupportParamResponse.setRequestId(_ctx.stringValue("DescribeParameterGroupSupportParamResponse.RequestId"));

		List<ResourceListItem> resourceList = new ArrayList<ResourceListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterGroupSupportParamResponse.ResourceList.Length"); i++) {
			ResourceListItem resourceListItem = new ResourceListItem();
			resourceListItem.setDbType(_ctx.stringValue("DescribeParameterGroupSupportParamResponse.ResourceList["+ i +"].DbType"));
			resourceListItem.setDbVersion(_ctx.stringValue("DescribeParameterGroupSupportParamResponse.ResourceList["+ i +"].DbVersion"));
			resourceListItem.setCategory(_ctx.stringValue("DescribeParameterGroupSupportParamResponse.ResourceList["+ i +"].Category"));
			resourceListItem.setParamName(_ctx.stringValue("DescribeParameterGroupSupportParamResponse.ResourceList["+ i +"].ParamName"));

			resourceList.add(resourceListItem);
		}
		describeParameterGroupSupportParamResponse.setResourceList(resourceList);
	 
	 	return describeParameterGroupSupportParamResponse;
	}
}