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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetSourceMapInfoResponse;
import com.aliyuncs.arms.model.v20190808.GetSourceMapInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSourceMapInfoResponseUnmarshaller {

	public static GetSourceMapInfoResponse unmarshall(GetSourceMapInfoResponse getSourceMapInfoResponse, UnmarshallerContext _ctx) {
		
		getSourceMapInfoResponse.setRequestId(_ctx.stringValue("GetSourceMapInfoResponse.RequestId"));

		List<Data> sourceMapList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("GetSourceMapInfoResponse.SourceMapList.Length"); i++) {
			Data data = new Data();
			data.setFid(_ctx.stringValue("GetSourceMapInfoResponse.SourceMapList["+ i +"].Fid"));
			data.setFileName(_ctx.stringValue("GetSourceMapInfoResponse.SourceMapList["+ i +"].FileName"));
			data.setSize(_ctx.stringValue("GetSourceMapInfoResponse.SourceMapList["+ i +"].Size"));
			data.setUploadTime(_ctx.stringValue("GetSourceMapInfoResponse.SourceMapList["+ i +"].UploadTime"));
			data.setVersion(_ctx.stringValue("GetSourceMapInfoResponse.SourceMapList["+ i +"].Version"));

			sourceMapList.add(data);
		}
		getSourceMapInfoResponse.setSourceMapList(sourceMapList);
	 
	 	return getSourceMapInfoResponse;
	}
}