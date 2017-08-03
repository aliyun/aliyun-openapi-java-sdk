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
package com.aliyuncs.cloudphoto.transform.v20170711;

import com.aliyuncs.cloudphoto.model.v20170711.GetQuotaResponse;
import com.aliyuncs.cloudphoto.model.v20170711.GetQuotaResponse.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQuotaResponseUnmarshaller {

	public static GetQuotaResponse unmarshall(GetQuotaResponse getQuotaResponse, UnmarshallerContext context) {
		
		getQuotaResponse.setRequestId(context.stringValue("GetQuotaResponse.RequestId"));
		getQuotaResponse.setCode(context.stringValue("GetQuotaResponse.Code"));
		getQuotaResponse.setMessage(context.stringValue("GetQuotaResponse.Message"));
		getQuotaResponse.setAction(context.stringValue("GetQuotaResponse.Action"));

		Quota quota = new Quota();
		quota.setTotalQuota(context.longValue("GetQuotaResponse.Quota.TotalQuota"));
		quota.setFacesCount(context.integerValue("GetQuotaResponse.Quota.FacesCount"));
		quota.setPhotosCount(context.integerValue("GetQuotaResponse.Quota.PhotosCount"));
		quota.setUsedQutoa(context.longValue("GetQuotaResponse.Quota.UsedQutoa"));
		quota.setVideosCount(context.integerValue("GetQuotaResponse.Quota.VideosCount"));
		getQuotaResponse.setQuota(quota);
	 
	 	return getQuotaResponse;
	}
}