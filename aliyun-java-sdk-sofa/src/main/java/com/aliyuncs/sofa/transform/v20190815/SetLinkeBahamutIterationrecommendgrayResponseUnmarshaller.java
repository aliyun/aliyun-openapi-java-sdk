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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutIterationrecommendgrayResponse;
import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutIterationrecommendgrayResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetLinkeBahamutIterationrecommendgrayResponseUnmarshaller {

	public static SetLinkeBahamutIterationrecommendgrayResponse unmarshall(SetLinkeBahamutIterationrecommendgrayResponse setLinkeBahamutIterationrecommendgrayResponse, UnmarshallerContext _ctx) {
		
		setLinkeBahamutIterationrecommendgrayResponse.setRequestId(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.RequestId"));
		setLinkeBahamutIterationrecommendgrayResponse.setResultCode(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.ResultCode"));
		setLinkeBahamutIterationrecommendgrayResponse.setResultMessage(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.ResultMessage"));
		setLinkeBahamutIterationrecommendgrayResponse.setErrorMessage(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.ErrorMessage"));
		setLinkeBahamutIterationrecommendgrayResponse.setErrorMsgParamsMap(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.ErrorMsgParamsMap"));
		setLinkeBahamutIterationrecommendgrayResponse.setMessage(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.Message"));
		setLinkeBahamutIterationrecommendgrayResponse.setResponseStatusCode(_ctx.longValue("SetLinkeBahamutIterationrecommendgrayResponse.ResponseStatusCode"));
		setLinkeBahamutIterationrecommendgrayResponse.setSuccess(_ctx.booleanValue("SetLinkeBahamutIterationrecommendgrayResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("SetLinkeBahamutIterationrecommendgrayResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setExternalId(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.Result["+ i +"].ExternalId"));
			resultItem.setName(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.Result["+ i +"].Owner"));

			List<String> grayAppNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationrecommendgrayResponse.Result["+ i +"].GrayAppNames.Length"); j++) {
				grayAppNames.add(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.Result["+ i +"].GrayAppNames["+ j +"]"));
			}
			resultItem.setGrayAppNames(grayAppNames);

			List<String> grayCodeNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationrecommendgrayResponse.Result["+ i +"].GrayCodeNames.Length"); j++) {
				grayCodeNames.add(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.Result["+ i +"].GrayCodeNames["+ j +"]"));
			}
			resultItem.setGrayCodeNames(grayCodeNames);

			List<String> releaseIterationUnitList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationrecommendgrayResponse.Result["+ i +"].ReleaseIterationUnitList.Length"); j++) {
				releaseIterationUnitList.add(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.Result["+ i +"].ReleaseIterationUnitList["+ j +"]"));
			}
			resultItem.setReleaseIterationUnitList(releaseIterationUnitList);

			List<String> unitsNotReady = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationrecommendgrayResponse.Result["+ i +"].UnitsNotReady.Length"); j++) {
				unitsNotReady.add(_ctx.stringValue("SetLinkeBahamutIterationrecommendgrayResponse.Result["+ i +"].UnitsNotReady["+ j +"]"));
			}
			resultItem.setUnitsNotReady(unitsNotReady);

			result.add(resultItem);
		}
		setLinkeBahamutIterationrecommendgrayResponse.setResult(result);
	 
	 	return setLinkeBahamutIterationrecommendgrayResponse;
	}
}