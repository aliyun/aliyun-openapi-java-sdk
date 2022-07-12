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

package com.aliyuncs.antiddos_public.transform.v20170518;

import com.aliyuncs.antiddos_public.model.v20170518.DescribeDdosCreditResponse;
import com.aliyuncs.antiddos_public.model.v20170518.DescribeDdosCreditResponse.DdosCredit;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDdosCreditResponseUnmarshaller {

	public static DescribeDdosCreditResponse unmarshall(DescribeDdosCreditResponse describeDdosCreditResponse, UnmarshallerContext _ctx) {
		
		describeDdosCreditResponse.setRequestId(_ctx.stringValue("DescribeDdosCreditResponse.RequestId"));
		describeDdosCreditResponse.setSuccess(_ctx.booleanValue("DescribeDdosCreditResponse.Success"));

		DdosCredit ddosCredit = new DdosCredit();
		ddosCredit.setScore(_ctx.integerValue("DescribeDdosCreditResponse.DdosCredit.Score"));
		ddosCredit.setScoreLevel(_ctx.stringValue("DescribeDdosCreditResponse.DdosCredit.ScoreLevel"));
		ddosCredit.setBlackholeTime(_ctx.integerValue("DescribeDdosCreditResponse.DdosCredit.BlackholeTime"));
		describeDdosCreditResponse.setDdosCredit(ddosCredit);
	 
	 	return describeDdosCreditResponse;
	}
}