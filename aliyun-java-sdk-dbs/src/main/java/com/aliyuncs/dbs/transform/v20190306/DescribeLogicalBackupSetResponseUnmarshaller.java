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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.DescribeLogicalBackupSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogicalBackupSetResponseUnmarshaller {

	public static DescribeLogicalBackupSetResponse unmarshall(DescribeLogicalBackupSetResponse describeLogicalBackupSetResponse, UnmarshallerContext _ctx) {
		
		describeLogicalBackupSetResponse.setRequestId(_ctx.stringValue("DescribeLogicalBackupSetResponse.RequestId"));
		describeLogicalBackupSetResponse.setSuccess(_ctx.booleanValue("DescribeLogicalBackupSetResponse.Success"));
		describeLogicalBackupSetResponse.setErrCode(_ctx.stringValue("DescribeLogicalBackupSetResponse.ErrCode"));
		describeLogicalBackupSetResponse.setErrMessage(_ctx.stringValue("DescribeLogicalBackupSetResponse.ErrMessage"));
		describeLogicalBackupSetResponse.setHttpStatusCode(_ctx.integerValue("DescribeLogicalBackupSetResponse.HttpStatusCode"));
		describeLogicalBackupSetResponse.setRowNum(_ctx.longValue("DescribeLogicalBackupSetResponse.RowNum"));
		describeLogicalBackupSetResponse.setStatus(_ctx.stringValue("DescribeLogicalBackupSetResponse.Status"));
	 
	 	return describeLogicalBackupSetResponse;
	}
}