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

package com.aliyuncs.imageprocess.transform.v20200320;

import com.aliyuncs.imageprocess.model.v20200320.DetectCovid19CadResponse;
import com.aliyuncs.imageprocess.model.v20200320.DetectCovid19CadResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectCovid19CadResponseUnmarshaller {

	public static DetectCovid19CadResponse unmarshall(DetectCovid19CadResponse detectCovid19CadResponse, UnmarshallerContext _ctx) {
		
		detectCovid19CadResponse.setRequestId(_ctx.stringValue("DetectCovid19CadResponse.RequestId"));

		Data data = new Data();
		data.setNewProbability(_ctx.stringValue("DetectCovid19CadResponse.Data.NewProbability"));
		data.setNormalProbability(_ctx.stringValue("DetectCovid19CadResponse.Data.NormalProbability"));
		data.setOtherProbability(_ctx.stringValue("DetectCovid19CadResponse.Data.OtherProbability"));
		data.setLesionRatio(_ctx.stringValue("DetectCovid19CadResponse.Data.LesionRatio"));
		data.setMask(_ctx.stringValue("DetectCovid19CadResponse.Data.Mask"));
		detectCovid19CadResponse.setData(data);
	 
	 	return detectCovid19CadResponse;
	}
}