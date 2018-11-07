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

import com.aliyuncs.emr.model.v20160408.DescribeJobMigrateInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobMigrateInfoResponseUnmarshaller {

	public static DescribeJobMigrateInfoResponse unmarshall(DescribeJobMigrateInfoResponse describeJobMigrateInfoResponse, UnmarshallerContext context) {
		
		describeJobMigrateInfoResponse.setId(context.stringValue("DescribeJobMigrateInfoResponse.Id"));
		describeJobMigrateInfoResponse.setName(context.stringValue("DescribeJobMigrateInfoResponse.Name"));
		describeJobMigrateInfoResponse.setType(context.stringValue("DescribeJobMigrateInfoResponse.Type"));
		describeJobMigrateInfoResponse.setMaxRetry(context.integerValue("DescribeJobMigrateInfoResponse.MaxRetry"));
		describeJobMigrateInfoResponse.setFailedAction(context.stringValue("DescribeJobMigrateInfoResponse.FailedAction"));
		describeJobMigrateInfoResponse.setParams(context.stringValue("DescribeJobMigrateInfoResponse.Params"));
		describeJobMigrateInfoResponse.setNewId(context.stringValue("DescribeJobMigrateInfoResponse.NewId"));
		describeJobMigrateInfoResponse.setPremigratedDate(context.stringValue("DescribeJobMigrateInfoResponse.PremigratedDate"));
		describeJobMigrateInfoResponse.setMigratedDate(context.stringValue("DescribeJobMigrateInfoResponse.MigratedDate"));
		describeJobMigrateInfoResponse.setPremigrateJson(context.stringValue("DescribeJobMigrateInfoResponse.PremigrateJson"));
	 
	 	return describeJobMigrateInfoResponse;
	}
}