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

package com.aliyuncs.afs.transform.v20180112;

import com.aliyuncs.afs.model.v20180112.DescribeCaptchaDayResponse;
import com.aliyuncs.afs.model.v20180112.DescribeCaptchaDayResponse.CaptchaDay;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCaptchaDayResponseUnmarshaller {

	public static DescribeCaptchaDayResponse unmarshall(DescribeCaptchaDayResponse describeCaptchaDayResponse, UnmarshallerContext context) {
		
		describeCaptchaDayResponse.setRequestId(context.stringValue("DescribeCaptchaDayResponse.RequestId"));
		describeCaptchaDayResponse.setBizCode(context.stringValue("DescribeCaptchaDayResponse.BizCode"));
		describeCaptchaDayResponse.setHasData(context.booleanValue("DescribeCaptchaDayResponse.HasData"));

		CaptchaDay captchaDay = new CaptchaDay();
		captchaDay.setInit(context.integerValue("DescribeCaptchaDayResponse.CaptchaDay.Init"));
		captchaDay.setAskForVerify(context.integerValue("DescribeCaptchaDayResponse.CaptchaDay.AskForVerify"));
		captchaDay.setDirecetStrategyInterception(context.integerValue("DescribeCaptchaDayResponse.CaptchaDay.DirecetStrategyInterception"));
		captchaDay.setTwiceVerify(context.integerValue("DescribeCaptchaDayResponse.CaptchaDay.TwiceVerify"));
		captchaDay.setPass(context.integerValue("DescribeCaptchaDayResponse.CaptchaDay.Pass"));
		captchaDay.setCheckTested(context.integerValue("DescribeCaptchaDayResponse.CaptchaDay.CheckTested"));
		captchaDay.setUncheckTested(context.integerValue("DescribeCaptchaDayResponse.CaptchaDay.UncheckTested"));
		captchaDay.setLegalSign(context.integerValue("DescribeCaptchaDayResponse.CaptchaDay.LegalSign"));
		captchaDay.setMaliciousFlow(context.integerValue("DescribeCaptchaDayResponse.CaptchaDay.MaliciousFlow"));
		describeCaptchaDayResponse.setCaptchaDay(captchaDay);
	 
	 	return describeCaptchaDayResponse;
	}
}