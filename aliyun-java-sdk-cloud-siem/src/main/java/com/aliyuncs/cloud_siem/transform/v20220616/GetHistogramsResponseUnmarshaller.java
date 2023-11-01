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

import com.aliyuncs.cloud_siem.model.v20220616.GetHistogramsResponse;
import com.aliyuncs.cloud_siem.model.v20220616.GetHistogramsResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.GetHistogramsResponse.Data.Histogram;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHistogramsResponseUnmarshaller {

	public static GetHistogramsResponse unmarshall(GetHistogramsResponse getHistogramsResponse, UnmarshallerContext _ctx) {
		
		getHistogramsResponse.setRequestId(_ctx.stringValue("GetHistogramsResponse.RequestId"));
		getHistogramsResponse.setSuccess(_ctx.booleanValue("GetHistogramsResponse.Success"));
		getHistogramsResponse.setCode(_ctx.integerValue("GetHistogramsResponse.Code"));
		getHistogramsResponse.setMessage(_ctx.stringValue("GetHistogramsResponse.Message"));
		getHistogramsResponse.setErrCode(_ctx.stringValue("GetHistogramsResponse.ErrCode"));
		getHistogramsResponse.setDyCode(_ctx.stringValue("GetHistogramsResponse.DyCode"));
		getHistogramsResponse.setDyMessage(_ctx.stringValue("GetHistogramsResponse.DyMessage"));

		Data data = new Data();
		data.setServer(_ctx.stringValue("GetHistogramsResponse.Data.Server"));
		data.setTotalCount(_ctx.longValue("GetHistogramsResponse.Data.TotalCount"));

		List<Histogram> histograms = new ArrayList<Histogram>();
		for (int i = 0; i < _ctx.lengthValue("GetHistogramsResponse.Data.Histograms.Length"); i++) {
			Histogram histogram = new Histogram();
			histogram.setFrom(_ctx.integerValue("GetHistogramsResponse.Data.Histograms["+ i +"].From"));
			histogram.setTo(_ctx.integerValue("GetHistogramsResponse.Data.Histograms["+ i +"].To"));
			histogram.setCount(_ctx.longValue("GetHistogramsResponse.Data.Histograms["+ i +"].Count"));
			histogram.setCompletedOrNot(_ctx.booleanValue("GetHistogramsResponse.Data.Histograms["+ i +"].CompletedOrNot"));

			histograms.add(histogram);
		}
		data.setHistograms(histograms);
		getHistogramsResponse.setData(data);
	 
	 	return getHistogramsResponse;
	}
}