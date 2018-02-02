/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.afs.transform.v20180112;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.afs.model.v20180112.DescribeCaptchaMinResponse;
import com.aliyuncs.afs.model.v20180112.DescribeCaptchaMinResponse.CaptchaMin;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCaptchaMinResponseUnmarshaller {

	public static DescribeCaptchaMinResponse unmarshall(DescribeCaptchaMinResponse describeCaptchaMinResponse, UnmarshallerContext context) {
		
		describeCaptchaMinResponse.setRequestId(context.stringValue("DescribeCaptchaMinResponse.RequestId"));
		describeCaptchaMinResponse.setBizCode(context.stringValue("DescribeCaptchaMinResponse.BizCode"));
		describeCaptchaMinResponse.setHasData(context.booleanValue("DescribeCaptchaMinResponse.HasData"));

		List<CaptchaMin> captchaMins = new ArrayList<CaptchaMin>();
		for (int i = 0; i < context.lengthValue("DescribeCaptchaMinResponse.CaptchaMins.Length"); i++) {
			CaptchaMin captchaMin = new CaptchaMin();
			captchaMin.setTime(context.stringValue("DescribeCaptchaMinResponse.CaptchaMins["+ i +"].Time"));
			captchaMin.setPass(context.stringValue("DescribeCaptchaMinResponse.CaptchaMins["+ i +"].Pass"));
			captchaMin.setInterception(context.stringValue("DescribeCaptchaMinResponse.CaptchaMins["+ i +"].Interception"));

			captchaMins.add(captchaMin);
		}
		describeCaptchaMinResponse.setCaptchaMins(captchaMins);
	 
	 	return describeCaptchaMinResponse;
	}
}