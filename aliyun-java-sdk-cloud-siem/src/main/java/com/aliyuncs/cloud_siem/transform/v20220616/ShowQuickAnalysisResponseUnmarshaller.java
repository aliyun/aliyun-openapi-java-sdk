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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.ShowQuickAnalysisResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ShowQuickAnalysisResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ShowQuickAnalysisResponseUnmarshaller {

	public static ShowQuickAnalysisResponse unmarshall(ShowQuickAnalysisResponse showQuickAnalysisResponse, UnmarshallerContext _ctx) {
		
		showQuickAnalysisResponse.setRequestId(_ctx.stringValue("ShowQuickAnalysisResponse.RequestId"));
		showQuickAnalysisResponse.setSuccess(_ctx.booleanValue("ShowQuickAnalysisResponse.Success"));
		showQuickAnalysisResponse.setCode(_ctx.integerValue("ShowQuickAnalysisResponse.Code"));
		showQuickAnalysisResponse.setMessage(_ctx.stringValue("ShowQuickAnalysisResponse.Message"));
		showQuickAnalysisResponse.setErrCode(_ctx.stringValue("ShowQuickAnalysisResponse.ErrCode"));
		showQuickAnalysisResponse.setDyCode(_ctx.stringValue("ShowQuickAnalysisResponse.DyCode"));
		showQuickAnalysisResponse.setDyMessage(_ctx.stringValue("ShowQuickAnalysisResponse.DyMessage"));

		Data data = new Data();

		List<String> indexList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ShowQuickAnalysisResponse.Data.IndexList.Length"); i++) {
			indexList.add(_ctx.stringValue("ShowQuickAnalysisResponse.Data.IndexList["+ i +"]"));
		}
		data.setIndexList(indexList);
		showQuickAnalysisResponse.setData(data);
	 
	 	return showQuickAnalysisResponse;
	}
}