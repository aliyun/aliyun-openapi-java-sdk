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

package com.aliyuncs.dcdn.transform.v20180115;

import com.aliyuncs.dcdn.model.v20180115.CreateSlrAndSlsProjectResponse;
import com.aliyuncs.dcdn.model.v20180115.CreateSlrAndSlsProjectResponse.SlsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSlrAndSlsProjectResponseUnmarshaller {

	public static CreateSlrAndSlsProjectResponse unmarshall(CreateSlrAndSlsProjectResponse createSlrAndSlsProjectResponse, UnmarshallerContext _ctx) {
		
		createSlrAndSlsProjectResponse.setRequestId(_ctx.stringValue("CreateSlrAndSlsProjectResponse.RequestId"));

		SlsInfo slsInfo = new SlsInfo();
		slsInfo.setProject(_ctx.stringValue("CreateSlrAndSlsProjectResponse.SlsInfo.Project"));
		slsInfo.setLogStore(_ctx.stringValue("CreateSlrAndSlsProjectResponse.SlsInfo.LogStore"));
		slsInfo.setEndPoint(_ctx.stringValue("CreateSlrAndSlsProjectResponse.SlsInfo.EndPoint"));
		slsInfo.setRegion(_ctx.stringValue("CreateSlrAndSlsProjectResponse.SlsInfo.Region"));
		createSlrAndSlsProjectResponse.setSlsInfo(slsInfo);
	 
	 	return createSlrAndSlsProjectResponse;
	}
}