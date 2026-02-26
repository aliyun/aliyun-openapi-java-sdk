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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeClassDetailsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClassDetailsResponseUnmarshaller {

	public static DescribeClassDetailsResponse unmarshall(DescribeClassDetailsResponse describeClassDetailsResponse, UnmarshallerContext _ctx) {
		
		describeClassDetailsResponse.setRequestId(_ctx.stringValue("DescribeClassDetailsResponse.RequestId"));
		describeClassDetailsResponse.setCategory(_ctx.stringValue("DescribeClassDetailsResponse.Category"));
		describeClassDetailsResponse.setClassCode(_ctx.stringValue("DescribeClassDetailsResponse.ClassCode"));
		describeClassDetailsResponse.setClassGroup(_ctx.stringValue("DescribeClassDetailsResponse.ClassGroup"));
		describeClassDetailsResponse.setCpu(_ctx.stringValue("DescribeClassDetailsResponse.Cpu"));
		describeClassDetailsResponse.setDBInstanceStorageType(_ctx.stringValue("DescribeClassDetailsResponse.DBInstanceStorageType"));
		describeClassDetailsResponse.setInstructionSetArch(_ctx.stringValue("DescribeClassDetailsResponse.InstructionSetArch"));
		describeClassDetailsResponse.setMaxConnections(_ctx.stringValue("DescribeClassDetailsResponse.MaxConnections"));
		describeClassDetailsResponse.setMaxIOMBPS(_ctx.stringValue("DescribeClassDetailsResponse.MaxIOMBPS"));
		describeClassDetailsResponse.setMaxIOPS(_ctx.stringValue("DescribeClassDetailsResponse.MaxIOPS"));
		describeClassDetailsResponse.setMemoryClass(_ctx.stringValue("DescribeClassDetailsResponse.MemoryClass"));
		describeClassDetailsResponse.setReferencePrice(_ctx.stringValue("DescribeClassDetailsResponse.ReferencePrice"));
	 
	 	return describeClassDetailsResponse;
	}
}