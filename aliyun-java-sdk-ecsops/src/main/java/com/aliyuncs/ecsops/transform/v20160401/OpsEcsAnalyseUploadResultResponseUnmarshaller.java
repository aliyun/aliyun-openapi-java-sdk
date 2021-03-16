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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsEcsAnalyseUploadResultResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEcsAnalyseUploadResultResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEcsAnalyseUploadResultResponseUnmarshaller {

	public static OpsEcsAnalyseUploadResultResponse unmarshall(OpsEcsAnalyseUploadResultResponse opsEcsAnalyseUploadResultResponse, UnmarshallerContext _ctx) {
		
		opsEcsAnalyseUploadResultResponse.setRequestId(_ctx.stringValue("OpsEcsAnalyseUploadResultResponse.RequestId"));

		List<Item> dataList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("OpsEcsAnalyseUploadResultResponse.DataList.Length"); i++) {
			Item item = new Item();
			item.setStatus(_ctx.stringValue("OpsEcsAnalyseUploadResultResponse.DataList["+ i +"].Status"));
			item.setDescription(_ctx.stringValue("OpsEcsAnalyseUploadResultResponse.DataList["+ i +"].Description"));
			item.setOfficialResponse(_ctx.stringValue("OpsEcsAnalyseUploadResultResponse.DataList["+ i +"].OfficialResponse"));
			item.setDetail(_ctx.stringValue("OpsEcsAnalyseUploadResultResponse.DataList["+ i +"].Detail"));
			item.setSolution(_ctx.stringValue("OpsEcsAnalyseUploadResultResponse.DataList["+ i +"].Solution"));
			item.setErrorType(_ctx.stringValue("OpsEcsAnalyseUploadResultResponse.DataList["+ i +"].ErrorType"));
			item.setName(_ctx.stringValue("OpsEcsAnalyseUploadResultResponse.DataList["+ i +"].Name"));
			item.setParameters(_ctx.stringValue("OpsEcsAnalyseUploadResultResponse.DataList["+ i +"].Parameters"));

			dataList.add(item);
		}
		opsEcsAnalyseUploadResultResponse.setDataList(dataList);
	 
	 	return opsEcsAnalyseUploadResultResponse;
	}
}