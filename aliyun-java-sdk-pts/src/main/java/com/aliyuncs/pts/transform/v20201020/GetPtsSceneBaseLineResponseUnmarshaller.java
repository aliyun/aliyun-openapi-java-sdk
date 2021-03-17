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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.GetPtsSceneBaseLineResponse;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneBaseLineResponse.Baseline;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneBaseLineResponse.Baseline.ChainBaselineData;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneBaseLineResponse.Baseline.SceneBaseline;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPtsSceneBaseLineResponseUnmarshaller {

	public static GetPtsSceneBaseLineResponse unmarshall(GetPtsSceneBaseLineResponse getPtsSceneBaseLineResponse, UnmarshallerContext _ctx) {
		
		getPtsSceneBaseLineResponse.setRequestId(_ctx.stringValue("GetPtsSceneBaseLineResponse.RequestId"));
		getPtsSceneBaseLineResponse.setSuccess(_ctx.booleanValue("GetPtsSceneBaseLineResponse.Success"));
		getPtsSceneBaseLineResponse.setCode(_ctx.stringValue("GetPtsSceneBaseLineResponse.Code"));
		getPtsSceneBaseLineResponse.setMessage(_ctx.stringValue("GetPtsSceneBaseLineResponse.Message"));
		getPtsSceneBaseLineResponse.setHttpStatusCode(_ctx.integerValue("GetPtsSceneBaseLineResponse.HttpStatusCode"));
		getPtsSceneBaseLineResponse.setSceneId(_ctx.stringValue("GetPtsSceneBaseLineResponse.SceneId"));

		Baseline baseline = new Baseline();
		baseline.setName(_ctx.stringValue("GetPtsSceneBaseLineResponse.Baseline.Name"));

		SceneBaseline sceneBaseline = new SceneBaseline();
		sceneBaseline.setAvgTps(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.SceneBaseline.AvgTps"));
		sceneBaseline.setAvgRt(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.SceneBaseline.AvgRt"));
		sceneBaseline.setSeg90Rt(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.SceneBaseline.Seg90Rt"));
		sceneBaseline.setSeg99Rt(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.SceneBaseline.Seg99Rt"));
		sceneBaseline.setSuccessRateReq(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.SceneBaseline.SuccessRateReq"));
		sceneBaseline.setSuccessRateBiz(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.SceneBaseline.SuccessRateBiz"));
		sceneBaseline.setFailCountReq(_ctx.longValue("GetPtsSceneBaseLineResponse.Baseline.SceneBaseline.FailCountReq"));
		sceneBaseline.setFailCountBiz(_ctx.longValue("GetPtsSceneBaseLineResponse.Baseline.SceneBaseline.FailCountBiz"));
		baseline.setSceneBaseline(sceneBaseline);

		List<ChainBaselineData> apiBaselines = new ArrayList<ChainBaselineData>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines.Length"); i++) {
			ChainBaselineData chainBaselineData = new ChainBaselineData();
			chainBaselineData.setAvgTps(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].AvgTps"));
			chainBaselineData.setAvgRt(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].AvgRt"));
			chainBaselineData.setSeg90Rt(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].Seg90Rt"));
			chainBaselineData.setSeg99Rt(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].Seg99Rt"));
			chainBaselineData.setSuccessRateReq(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].SuccessRateReq"));
			chainBaselineData.setSuccessRateBiz(_ctx.floatValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].SuccessRateBiz"));
			chainBaselineData.setFailCountReq(_ctx.longValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].FailCountReq"));
			chainBaselineData.setFailCountBiz(_ctx.longValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].FailCountBiz"));
			chainBaselineData.setMinRt(_ctx.integerValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].MinRt"));
			chainBaselineData.setMaxRt(_ctx.integerValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].MaxRt"));
			chainBaselineData.setName(_ctx.stringValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].Name"));
			chainBaselineData.setId(_ctx.longValue("GetPtsSceneBaseLineResponse.Baseline.ApiBaselines["+ i +"].Id"));

			apiBaselines.add(chainBaselineData);
		}
		baseline.setApiBaselines(apiBaselines);
		getPtsSceneBaseLineResponse.setBaseline(baseline);
	 
	 	return getPtsSceneBaseLineResponse;
	}
}