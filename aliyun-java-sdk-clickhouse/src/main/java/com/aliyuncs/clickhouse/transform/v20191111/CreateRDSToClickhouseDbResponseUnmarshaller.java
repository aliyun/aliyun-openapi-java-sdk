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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.CreateRDSToClickhouseDbResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRDSToClickhouseDbResponseUnmarshaller {

	public static CreateRDSToClickhouseDbResponse unmarshall(CreateRDSToClickhouseDbResponse createRDSToClickhouseDbResponse, UnmarshallerContext _ctx) {
		
		createRDSToClickhouseDbResponse.setRequestId(_ctx.stringValue("CreateRDSToClickhouseDbResponse.RequestId"));
		createRDSToClickhouseDbResponse.setStatus(_ctx.longValue("CreateRDSToClickhouseDbResponse.Status"));
		createRDSToClickhouseDbResponse.setErrorMsg(_ctx.stringValue("CreateRDSToClickhouseDbResponse.ErrorMsg"));

		List<String> repeatedDbs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateRDSToClickhouseDbResponse.RepeatedDbs.Length"); i++) {
			repeatedDbs.add(_ctx.stringValue("CreateRDSToClickhouseDbResponse.RepeatedDbs["+ i +"]"));
		}
		createRDSToClickhouseDbResponse.setRepeatedDbs(repeatedDbs);
	 
	 	return createRDSToClickhouseDbResponse;
	}
}