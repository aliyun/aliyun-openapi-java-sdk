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

package com.aliyuncs.fss.transform.v20190125;

import com.aliyuncs.fss.model.v20190125.GetSoftwareFilePatternUrlResponse;
import com.aliyuncs.fss.model.v20190125.GetSoftwareFilePatternUrlResponse.PatternInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSoftwareFilePatternUrlResponseUnmarshaller {

	public static GetSoftwareFilePatternUrlResponse unmarshall(GetSoftwareFilePatternUrlResponse getSoftwareFilePatternUrlResponse, UnmarshallerContext _ctx) {
		
		getSoftwareFilePatternUrlResponse.setRequestId(_ctx.stringValue("GetSoftwareFilePatternUrlResponse.RequestId"));
		getSoftwareFilePatternUrlResponse.setFssCode(_ctx.integerValue("GetSoftwareFilePatternUrlResponse.FssCode"));
		getSoftwareFilePatternUrlResponse.setFssMessage(_ctx.stringValue("GetSoftwareFilePatternUrlResponse.FssMessage"));

		PatternInfo patternInfo = new PatternInfo();
		patternInfo.setLatestUpdateTime(_ctx.stringValue("GetSoftwareFilePatternUrlResponse.PatternInfo.LatestUpdateTime"));
		patternInfo.setUrl(_ctx.stringValue("GetSoftwareFilePatternUrlResponse.PatternInfo.Url"));
		patternInfo.setPath(_ctx.stringValue("GetSoftwareFilePatternUrlResponse.PatternInfo.Path"));
		getSoftwareFilePatternUrlResponse.setPatternInfo(patternInfo);
	 
	 	return getSoftwareFilePatternUrlResponse;
	}
}