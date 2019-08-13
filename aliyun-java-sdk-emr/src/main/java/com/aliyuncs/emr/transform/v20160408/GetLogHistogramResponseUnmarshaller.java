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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.GetLogHistogramResponse;
import com.aliyuncs.emr.model.v20160408.GetLogHistogramResponse.SlsLogHistogram;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLogHistogramResponseUnmarshaller {

	public static GetLogHistogramResponse unmarshall(GetLogHistogramResponse getLogHistogramResponse, UnmarshallerContext _ctx) {
		
		getLogHistogramResponse.setRequestId(_ctx.stringValue("GetLogHistogramResponse.RequestId"));
		getLogHistogramResponse.setCompleted(_ctx.booleanValue("GetLogHistogramResponse.Completed"));
		getLogHistogramResponse.setTotalCount(_ctx.longValue("GetLogHistogramResponse.TotalCount"));

		List<SlsLogHistogram> slsLogHistogramList = new ArrayList<SlsLogHistogram>();
		for (int i = 0; i < _ctx.lengthValue("GetLogHistogramResponse.SlsLogHistogramList.Length"); i++) {
			SlsLogHistogram slsLogHistogram = new SlsLogHistogram();
			slsLogHistogram.setFromTime(_ctx.integerValue("GetLogHistogramResponse.SlsLogHistogramList["+ i +"].FromTime"));
			slsLogHistogram.setToTime(_ctx.integerValue("GetLogHistogramResponse.SlsLogHistogramList["+ i +"].ToTime"));
			slsLogHistogram.setCount(_ctx.longValue("GetLogHistogramResponse.SlsLogHistogramList["+ i +"].Count"));
			slsLogHistogram.setCompleted(_ctx.booleanValue("GetLogHistogramResponse.SlsLogHistogramList["+ i +"].Completed"));

			slsLogHistogramList.add(slsLogHistogram);
		}
		getLogHistogramResponse.setSlsLogHistogramList(slsLogHistogramList);
	 
	 	return getLogHistogramResponse;
	}
}