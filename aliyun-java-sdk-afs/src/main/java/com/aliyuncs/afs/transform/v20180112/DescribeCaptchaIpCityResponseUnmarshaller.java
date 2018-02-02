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

import com.aliyuncs.afs.model.v20180112.DescribeCaptchaIpCityResponse;
import com.aliyuncs.afs.model.v20180112.DescribeCaptchaIpCityResponse.CaptchaCitie;
import com.aliyuncs.afs.model.v20180112.DescribeCaptchaIpCityResponse.CaptchaIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCaptchaIpCityResponseUnmarshaller {

	public static DescribeCaptchaIpCityResponse unmarshall(DescribeCaptchaIpCityResponse describeCaptchaIpCityResponse, UnmarshallerContext context) {
		
		describeCaptchaIpCityResponse.setRequestId(context.stringValue("DescribeCaptchaIpCityResponse.RequestId"));
		describeCaptchaIpCityResponse.setBizCode(context.stringValue("DescribeCaptchaIpCityResponse.BizCode"));
		describeCaptchaIpCityResponse.setHasData(context.booleanValue("DescribeCaptchaIpCityResponse.HasData"));

		List<CaptchaCitie> captchaCities = new ArrayList<CaptchaCitie>();
		for (int i = 0; i < context.lengthValue("DescribeCaptchaIpCityResponse.CaptchaCities.Length"); i++) {
			CaptchaCitie captchaCitie = new CaptchaCitie();
			captchaCitie.setLocation(context.stringValue("DescribeCaptchaIpCityResponse.CaptchaCities["+ i +"].Location"));
			captchaCitie.setLat(context.stringValue("DescribeCaptchaIpCityResponse.CaptchaCities["+ i +"].Lat"));
			captchaCitie.setLng(context.stringValue("DescribeCaptchaIpCityResponse.CaptchaCities["+ i +"].Lng"));
			captchaCitie.setPv(context.integerValue("DescribeCaptchaIpCityResponse.CaptchaCities["+ i +"].Pv"));

			captchaCities.add(captchaCitie);
		}
		describeCaptchaIpCityResponse.setCaptchaCities(captchaCities);

		List<CaptchaIp> captchaIps = new ArrayList<CaptchaIp>();
		for (int i = 0; i < context.lengthValue("DescribeCaptchaIpCityResponse.CaptchaIps.Length"); i++) {
			CaptchaIp captchaIp = new CaptchaIp();
			captchaIp.setIp(context.stringValue("DescribeCaptchaIpCityResponse.CaptchaIps["+ i +"].Ip"));
			captchaIp.setValue(context.integerValue("DescribeCaptchaIpCityResponse.CaptchaIps["+ i +"].Value"));

			captchaIps.add(captchaIp);
		}
		describeCaptchaIpCityResponse.setCaptchaIps(captchaIps);
	 
	 	return describeCaptchaIpCityResponse;
	}
}