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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutReleasestatusResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutReleasestatusResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutReleasestatusResponseUnmarshaller {

	public static CheckLinkeBahamutReleasestatusResponse unmarshall(CheckLinkeBahamutReleasestatusResponse checkLinkeBahamutReleasestatusResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutReleasestatusResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutReleasestatusResponse.RequestId"));
		checkLinkeBahamutReleasestatusResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutReleasestatusResponse.ResultCode"));
		checkLinkeBahamutReleasestatusResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutReleasestatusResponse.ResultMessage"));
		checkLinkeBahamutReleasestatusResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutReleasestatusResponse.ErrorMessage"));
		checkLinkeBahamutReleasestatusResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutReleasestatusResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutReleasestatusResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutReleasestatusResponse.Message"));
		checkLinkeBahamutReleasestatusResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutReleasestatusResponse.ResponseStatusCode"));
		checkLinkeBahamutReleasestatusResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutReleasestatusResponse.Success"));

		Result result = new Result();
		result.setReady(_ctx.booleanValue("CheckLinkeBahamutReleasestatusResponse.Result.Ready"));
		result.setReleaseApplied(_ctx.booleanValue("CheckLinkeBahamutReleasestatusResponse.Result.ReleaseApplied"));

		List<String> appsNotApplied = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutReleasestatusResponse.Result.AppsNotApplied.Length"); i++) {
			appsNotApplied.add(_ctx.stringValue("CheckLinkeBahamutReleasestatusResponse.Result.AppsNotApplied["+ i +"]"));
		}
		result.setAppsNotApplied(appsNotApplied);

		List<String> unitsNotYetReady = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutReleasestatusResponse.Result.UnitsNotYetReady.Length"); i++) {
			unitsNotYetReady.add(_ctx.stringValue("CheckLinkeBahamutReleasestatusResponse.Result.UnitsNotYetReady["+ i +"]"));
		}
		result.setUnitsNotYetReady(unitsNotYetReady);
		checkLinkeBahamutReleasestatusResponse.setResult(result);
	 
	 	return checkLinkeBahamutReleasestatusResponse;
	}
}