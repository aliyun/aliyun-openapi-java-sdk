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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.ReleaseMovieSeatResponse;
import com.aliyuncs.linkedmall.model.v20180116.ReleaseMovieSeatResponse.ActionResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseMovieSeatResponseUnmarshaller {

	public static ReleaseMovieSeatResponse unmarshall(ReleaseMovieSeatResponse releaseMovieSeatResponse, UnmarshallerContext _ctx) {
		
		releaseMovieSeatResponse.setRequestId(_ctx.stringValue("ReleaseMovieSeatResponse.RequestId"));
		releaseMovieSeatResponse.setCode(_ctx.stringValue("ReleaseMovieSeatResponse.Code"));
		releaseMovieSeatResponse.setMessage(_ctx.stringValue("ReleaseMovieSeatResponse.Message"));
		releaseMovieSeatResponse.setSubCode(_ctx.stringValue("ReleaseMovieSeatResponse.SubCode"));
		releaseMovieSeatResponse.setSubMessage(_ctx.stringValue("ReleaseMovieSeatResponse.SubMessage"));
		releaseMovieSeatResponse.setLogsId(_ctx.stringValue("ReleaseMovieSeatResponse.LogsId"));
		releaseMovieSeatResponse.setSuccess(_ctx.booleanValue("ReleaseMovieSeatResponse.Success"));

		ActionResult actionResult = new ActionResult();
		actionResult.setReturnCode(_ctx.stringValue("ReleaseMovieSeatResponse.ActionResult.ReturnCode"));
		actionResult.setReturnValue(_ctx.stringValue("ReleaseMovieSeatResponse.ActionResult.ReturnValue"));
		actionResult.setReturnMessage(_ctx.stringValue("ReleaseMovieSeatResponse.ActionResult.ReturnMessage"));
		releaseMovieSeatResponse.setActionResult(actionResult);
	 
	 	return releaseMovieSeatResponse;
	}
}