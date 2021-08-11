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

package com.aliyuncs.ivision.transform.v20190308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivision.model.v20190308.GetAlgorithmHistogramsResponse;
import com.aliyuncs.ivision.model.v20190308.GetAlgorithmHistogramsResponse.Data;
import com.aliyuncs.ivision.model.v20190308.GetAlgorithmHistogramsResponse.Data.HistogramsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlgorithmHistogramsResponseUnmarshaller {

	public static GetAlgorithmHistogramsResponse unmarshall(GetAlgorithmHistogramsResponse getAlgorithmHistogramsResponse, UnmarshallerContext _ctx) {
		
		getAlgorithmHistogramsResponse.setRequestId(_ctx.stringValue("GetAlgorithmHistogramsResponse.RequestId"));
		getAlgorithmHistogramsResponse.setMessage(_ctx.stringValue("GetAlgorithmHistogramsResponse.Message"));
		getAlgorithmHistogramsResponse.setCode(_ctx.stringValue("GetAlgorithmHistogramsResponse.Code"));
		getAlgorithmHistogramsResponse.setSuccess(_ctx.booleanValue("GetAlgorithmHistogramsResponse.Success"));

		Data data = new Data();
		data.setFailureCount(_ctx.integerValue("GetAlgorithmHistogramsResponse.Data.FailureCount"));
		data.setSuccessCount(_ctx.integerValue("GetAlgorithmHistogramsResponse.Data.SuccessCount"));

		List<HistogramsItem> histograms = new ArrayList<HistogramsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAlgorithmHistogramsResponse.Data.Histograms.Length"); i++) {
			HistogramsItem histogramsItem = new HistogramsItem();
			histogramsItem.setTime(_ctx.stringValue("GetAlgorithmHistogramsResponse.Data.Histograms["+ i +"].Time"));
			histogramsItem.setFailureCount(_ctx.integerValue("GetAlgorithmHistogramsResponse.Data.Histograms["+ i +"].FailureCount"));
			histogramsItem.setSuccessCount(_ctx.integerValue("GetAlgorithmHistogramsResponse.Data.Histograms["+ i +"].SuccessCount"));

			histograms.add(histogramsItem);
		}
		data.setHistograms(histograms);
		getAlgorithmHistogramsResponse.setData(data);
	 
	 	return getAlgorithmHistogramsResponse;
	}
}