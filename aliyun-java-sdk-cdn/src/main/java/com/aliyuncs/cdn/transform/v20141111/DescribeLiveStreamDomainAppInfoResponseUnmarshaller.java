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
package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamDomainAppInfoResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamDomainAppInfoResponse.DomainAppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamDomainAppInfoResponseUnmarshaller {

	public static DescribeLiveStreamDomainAppInfoResponse unmarshall(DescribeLiveStreamDomainAppInfoResponse describeLiveStreamDomainAppInfoResponse, UnmarshallerContext context) {
		
		describeLiveStreamDomainAppInfoResponse.setRequestId(context.stringValue("DescribeLiveStreamDomainAppInfoResponse.RequestId"));

		List<DomainAppInfo> domainAppList = new ArrayList<DomainAppInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamDomainAppInfoResponse.DomainAppList.Length"); i++) {
			DomainAppInfo domainAppInfo = new DomainAppInfo();
			domainAppInfo.setAppDomain(context.stringValue("DescribeLiveStreamDomainAppInfoResponse.DomainAppList["+ i +"].AppDomain"));
			domainAppInfo.setAppId(context.stringValue("DescribeLiveStreamDomainAppInfoResponse.DomainAppList["+ i +"].AppId"));
			domainAppInfo.setAppKey(context.stringValue("DescribeLiveStreamDomainAppInfoResponse.DomainAppList["+ i +"].AppKey"));
			domainAppInfo.setAppOssBucket(context.stringValue("DescribeLiveStreamDomainAppInfoResponse.DomainAppList["+ i +"].AppOssBucket"));
			domainAppInfo.setAppOssHost(context.stringValue("DescribeLiveStreamDomainAppInfoResponse.DomainAppList["+ i +"].AppOssHost"));
			domainAppInfo.setAppOwnerId(context.stringValue("DescribeLiveStreamDomainAppInfoResponse.DomainAppList["+ i +"].AppOwnerId"));
			domainAppInfo.setAppSecret(context.stringValue("DescribeLiveStreamDomainAppInfoResponse.DomainAppList["+ i +"].AppSecret"));
			domainAppInfo.setUpdateTime(context.stringValue("DescribeLiveStreamDomainAppInfoResponse.DomainAppList["+ i +"].UpdateTime"));

			domainAppList.add(domainAppInfo);
		}
		describeLiveStreamDomainAppInfoResponse.setDomainAppList(domainAppList);
	 
	 	return describeLiveStreamDomainAppInfoResponse;
	}
}