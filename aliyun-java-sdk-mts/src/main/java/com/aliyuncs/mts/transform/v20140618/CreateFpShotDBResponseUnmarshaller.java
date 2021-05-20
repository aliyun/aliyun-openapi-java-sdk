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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.CreateFpShotDBResponse;
import com.aliyuncs.mts.model.v20140618.CreateFpShotDBResponse.FpShotDB;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFpShotDBResponseUnmarshaller {

	public static CreateFpShotDBResponse unmarshall(CreateFpShotDBResponse createFpShotDBResponse, UnmarshallerContext _ctx) {
		
		createFpShotDBResponse.setRequestId(_ctx.stringValue("CreateFpShotDBResponse.RequestId"));

		FpShotDB fpShotDB = new FpShotDB();
		fpShotDB.setDescription(_ctx.stringValue("CreateFpShotDBResponse.FpShotDB.Description"));
		fpShotDB.setState(_ctx.stringValue("CreateFpShotDBResponse.FpShotDB.State"));
		fpShotDB.setName(_ctx.stringValue("CreateFpShotDBResponse.FpShotDB.Name"));
		fpShotDB.setFpDBId(_ctx.stringValue("CreateFpShotDBResponse.FpShotDB.FpDBId"));
		fpShotDB.setModelId(_ctx.integerValue("CreateFpShotDBResponse.FpShotDB.ModelId"));
		fpShotDB.setConfig(_ctx.stringValue("CreateFpShotDBResponse.FpShotDB.Config"));
		createFpShotDBResponse.setFpShotDB(fpShotDB);
	 
	 	return createFpShotDBResponse;
	}
}