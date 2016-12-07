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
package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.RefreshCdnDomainConfigsCacheResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefreshCdnDomainConfigsCacheResponseUnmarshaller {

	public static RefreshCdnDomainConfigsCacheResponse unmarshall(RefreshCdnDomainConfigsCacheResponse refreshCdnDomainConfigsCacheResponse, UnmarshallerContext context) {
		
		refreshCdnDomainConfigsCacheResponse.setRequestId(context.stringValue("RefreshCdnDomainConfigsCacheResponse.RequestId"));

		List<String> sucessDomains = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("RefreshCdnDomainConfigsCacheResponse.SucessDomains.Length"); i++) {
			sucessDomains.add(context.stringValue("RefreshCdnDomainConfigsCacheResponse.SucessDomains["+ i +"]"));
		}
		refreshCdnDomainConfigsCacheResponse.setSucessDomains(sucessDomains);

		List<String> failedDomains = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("RefreshCdnDomainConfigsCacheResponse.FailedDomains.Length"); i++) {
			failedDomains.add(context.stringValue("RefreshCdnDomainConfigsCacheResponse.FailedDomains["+ i +"]"));
		}
		refreshCdnDomainConfigsCacheResponse.setFailedDomains(failedDomains);
	 
	 	return refreshCdnDomainConfigsCacheResponse;
	}
}