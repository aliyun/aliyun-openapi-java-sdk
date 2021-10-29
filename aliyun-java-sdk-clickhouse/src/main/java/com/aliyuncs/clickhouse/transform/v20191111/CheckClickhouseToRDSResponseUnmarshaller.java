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

package com.aliyuncs.clickhouse.transform.v20191111;

import com.aliyuncs.clickhouse.model.v20191111.CheckClickhouseToRDSResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckClickhouseToRDSResponseUnmarshaller {

	public static CheckClickhouseToRDSResponse unmarshall(CheckClickhouseToRDSResponse checkClickhouseToRDSResponse, UnmarshallerContext _ctx) {
		
		checkClickhouseToRDSResponse.setRequestId(_ctx.stringValue("CheckClickhouseToRDSResponse.RequestId"));
		checkClickhouseToRDSResponse.setStatus(_ctx.booleanValue("CheckClickhouseToRDSResponse.Status"));
		checkClickhouseToRDSResponse.setErrorCode(_ctx.stringValue("CheckClickhouseToRDSResponse.ErrorCode"));
	 
	 	return checkClickhouseToRDSResponse;
	}
}