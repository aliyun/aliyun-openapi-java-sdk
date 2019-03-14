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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeDataSourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSourceResponseUnmarshaller {

	public static DescribeDataSourceResponse unmarshall(DescribeDataSourceResponse describeDataSourceResponse, UnmarshallerContext context) {
		
		describeDataSourceResponse.setRequestId(context.stringValue("DescribeDataSourceResponse.RequestId"));
		describeDataSourceResponse.setId(context.stringValue("DescribeDataSourceResponse.Id"));
		describeDataSourceResponse.setName(context.stringValue("DescribeDataSourceResponse.Name"));
		describeDataSourceResponse.setDescription(context.stringValue("DescribeDataSourceResponse.Description"));
		describeDataSourceResponse.setCategoryId(context.stringValue("DescribeDataSourceResponse.CategoryId"));
		describeDataSourceResponse.setStatus(context.stringValue("DescribeDataSourceResponse.Status"));
		describeDataSourceResponse.setSourceType(context.stringValue("DescribeDataSourceResponse.SourceType"));
		describeDataSourceResponse.setCreateFrom(context.stringValue("DescribeDataSourceResponse.CreateFrom"));
		describeDataSourceResponse.setConf(context.stringValue("DescribeDataSourceResponse.Conf"));
		describeDataSourceResponse.setClusterId(context.stringValue("DescribeDataSourceResponse.ClusterId"));
		describeDataSourceResponse.setCreator(context.stringValue("DescribeDataSourceResponse.Creator"));
		describeDataSourceResponse.setModifier(context.stringValue("DescribeDataSourceResponse.Modifier"));
		describeDataSourceResponse.setGmtCreate(context.longValue("DescribeDataSourceResponse.GmtCreate"));
		describeDataSourceResponse.setGmtModified(context.longValue("DescribeDataSourceResponse.GmtModified"));
	 
	 	return describeDataSourceResponse;
	}
}