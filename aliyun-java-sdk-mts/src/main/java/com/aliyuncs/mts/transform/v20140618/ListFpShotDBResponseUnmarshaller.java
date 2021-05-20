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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListFpShotDBResponse;
import com.aliyuncs.mts.model.v20140618.ListFpShotDBResponse.FpShotDB;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFpShotDBResponseUnmarshaller {

	public static ListFpShotDBResponse unmarshall(ListFpShotDBResponse listFpShotDBResponse, UnmarshallerContext _ctx) {
		
		listFpShotDBResponse.setRequestId(_ctx.stringValue("ListFpShotDBResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListFpShotDBResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("ListFpShotDBResponse.NonExistIds["+ i +"]"));
		}
		listFpShotDBResponse.setNonExistIds(nonExistIds);

		List<FpShotDB> fpShotDBList = new ArrayList<FpShotDB>();
		for (int i = 0; i < _ctx.lengthValue("ListFpShotDBResponse.FpShotDBList.Length"); i++) {
			FpShotDB fpShotDB = new FpShotDB();
			fpShotDB.setStatus(_ctx.stringValue("ListFpShotDBResponse.FpShotDBList["+ i +"].Status"));
			fpShotDB.setDescription(_ctx.stringValue("ListFpShotDBResponse.FpShotDBList["+ i +"].Description"));
			fpShotDB.setName(_ctx.stringValue("ListFpShotDBResponse.FpShotDBList["+ i +"].Name"));
			fpShotDB.setModelId(_ctx.integerValue("ListFpShotDBResponse.FpShotDBList["+ i +"].ModelId"));
			fpShotDB.setFpDBId(_ctx.stringValue("ListFpShotDBResponse.FpShotDBList["+ i +"].FpDBId"));

			fpShotDBList.add(fpShotDB);
		}
		listFpShotDBResponse.setFpShotDBList(fpShotDBList);
	 
	 	return listFpShotDBResponse;
	}
}