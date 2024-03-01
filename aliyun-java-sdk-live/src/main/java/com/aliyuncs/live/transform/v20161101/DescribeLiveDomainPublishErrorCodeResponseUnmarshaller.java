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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainPublishErrorCodeResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainPublishErrorCodeResponse.Rtcd;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainPublishErrorCodeResponse.Rtcd.Cd;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainPublishErrorCodeResponseUnmarshaller {

	public static DescribeLiveDomainPublishErrorCodeResponse unmarshall(DescribeLiveDomainPublishErrorCodeResponse describeLiveDomainPublishErrorCodeResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainPublishErrorCodeResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainPublishErrorCodeResponse.RequestId"));
		describeLiveDomainPublishErrorCodeResponse.setDataInterval(_ctx.stringValue("DescribeLiveDomainPublishErrorCodeResponse.DataInterval"));
		describeLiveDomainPublishErrorCodeResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainPublishErrorCodeResponse.DomainName"));
		describeLiveDomainPublishErrorCodeResponse.setStartTime(_ctx.stringValue("DescribeLiveDomainPublishErrorCodeResponse.StartTime"));
		describeLiveDomainPublishErrorCodeResponse.setEndTime(_ctx.stringValue("DescribeLiveDomainPublishErrorCodeResponse.EndTime"));

		List<Rtcd> realTimeCodeData = new ArrayList<Rtcd>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainPublishErrorCodeResponse.RealTimeCodeData.Length"); i++) {
			Rtcd rtcd = new Rtcd();
			rtcd.setTimeStamp(_ctx.stringValue("DescribeLiveDomainPublishErrorCodeResponse.RealTimeCodeData["+ i +"].TimeStamp"));

			List<Cd> codeData = new ArrayList<Cd>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveDomainPublishErrorCodeResponse.RealTimeCodeData["+ i +"].CodeData.Length"); j++) {
				Cd cd = new Cd();
				cd.setCode(_ctx.stringValue("DescribeLiveDomainPublishErrorCodeResponse.RealTimeCodeData["+ i +"].CodeData["+ j +"].Code"));
				cd.setCount(_ctx.stringValue("DescribeLiveDomainPublishErrorCodeResponse.RealTimeCodeData["+ i +"].CodeData["+ j +"].Count"));
				cd.setProportion(_ctx.stringValue("DescribeLiveDomainPublishErrorCodeResponse.RealTimeCodeData["+ i +"].CodeData["+ j +"].Proportion"));

				codeData.add(cd);
			}
			rtcd.setCodeData(codeData);

			realTimeCodeData.add(rtcd);
		}
		describeLiveDomainPublishErrorCodeResponse.setRealTimeCodeData(realTimeCodeData);
	 
	 	return describeLiveDomainPublishErrorCodeResponse;
	}
}