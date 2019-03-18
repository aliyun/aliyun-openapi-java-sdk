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
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiDocResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ErrorCodeSample;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.RequestConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.RequestParameter;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApiDocResponseUnmarshaller {

	public static DescribeApiDocResponse unmarshall(DescribeApiDocResponse describeApiDocResponse, UnmarshallerContext context) {
		
		describeApiDocResponse.setRequestId(context.stringValue("DescribeApiDocResponse.RequestId"));
		describeApiDocResponse.setRegionId(context.stringValue("DescribeApiDocResponse.RegionId"));
		describeApiDocResponse.setGroupId(context.stringValue("DescribeApiDocResponse.GroupId"));
		describeApiDocResponse.setGroupName(context.stringValue("DescribeApiDocResponse.GroupName"));
		describeApiDocResponse.setStageName(context.stringValue("DescribeApiDocResponse.StageName"));
		describeApiDocResponse.setApiId(context.stringValue("DescribeApiDocResponse.ApiId"));
		describeApiDocResponse.setApiName(context.stringValue("DescribeApiDocResponse.ApiName"));
		describeApiDocResponse.setDescription(context.stringValue("DescribeApiDocResponse.Description"));
		describeApiDocResponse.setVisibility(context.stringValue("DescribeApiDocResponse.Visibility"));
		describeApiDocResponse.setAuthType(context.stringValue("DescribeApiDocResponse.AuthType"));
		describeApiDocResponse.setForceNonceCheck(context.booleanValue("DescribeApiDocResponse.ForceNonceCheck"));
		describeApiDocResponse.setDisableInternet(context.booleanValue("DescribeApiDocResponse.DisableInternet"));

		describeApiDocResponse.setResultType(context.stringValue("DescribeApiDocResponse.ResultType"));
		describeApiDocResponse.setResultSample(context.stringValue("DescribeApiDocResponse.ResultSample"));
		describeApiDocResponse.setFailResultSample(context.stringValue("DescribeApiDocResponse.FailResultSample"));
		describeApiDocResponse.setDeployedTime(context.stringValue("DescribeApiDocResponse.DeployedTime"));

		RequestConfig requestConfig = new RequestConfig();
		requestConfig.setRequestProtocol(context.stringValue("DescribeApiDocResponse.RequestConfig.RequestProtocol"));
		requestConfig.setRequestHttpMethod(context.stringValue("DescribeApiDocResponse.RequestConfig.RequestHttpMethod"));
		requestConfig.setRequestPath(context.stringValue("DescribeApiDocResponse.RequestConfig.RequestPath"));
		requestConfig.setBodyFormat(context.stringValue("DescribeApiDocResponse.RequestConfig.BodyFormat"));
		requestConfig.setPostBodyDescription(context.stringValue("DescribeApiDocResponse.RequestConfig.PostBodyDescription"));
		requestConfig.setRequestMode(context.stringValue("DescribeApiDocResponse.RequestConfig.RequestMode"));
		describeApiDocResponse.setRequestConfig(requestConfig);

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();
		for (int i = 0; i < context.lengthValue("DescribeApiDocResponse.RequestParameters.Length"); i++) {
			RequestParameter requestParameter = new RequestParameter();
			requestParameter.setApiParameterName(context.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].ApiParameterName"));
			requestParameter.setLocation(context.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].Location"));
			requestParameter.setParameterType(context.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].ParameterType"));
			requestParameter.setRequired(context.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].Required"));
			requestParameter.setDefaultValue(context.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].DefaultValue"));
			requestParameter.setDemoValue(context.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].DemoValue"));
			requestParameter.setMaxValue(context.longValue("DescribeApiDocResponse.RequestParameters["+ i +"].MaxValue"));
			requestParameter.setMinValue(context.longValue("DescribeApiDocResponse.RequestParameters["+ i +"].MinValue"));
			requestParameter.setMaxLength(context.longValue("DescribeApiDocResponse.RequestParameters["+ i +"].MaxLength"));
			requestParameter.setMinLength(context.longValue("DescribeApiDocResponse.RequestParameters["+ i +"].MinLength"));
			requestParameter.setRegularExpression(context.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].RegularExpression"));
			requestParameter.setJsonScheme(context.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].JsonScheme"));
			requestParameter.setEnumValue(context.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].EnumValue"));
			requestParameter.setDocShow(context.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].DocShow"));
			requestParameter.setDocOrder(context.integerValue("DescribeApiDocResponse.RequestParameters["+ i +"].DocOrder"));
			requestParameter.setDescription(context.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].Description"));

			requestParameters.add(requestParameter);
		}
		describeApiDocResponse.setRequestParameters(requestParameters);
		
		List<ErrorCodeSample> errorCodeSamples = new ArrayList<ErrorCodeSample>();
		for (int i = 0; i < context.lengthValue("DescribeApiDocResponse.ErrorCodeSamples.Length"); i++) {
			ErrorCodeSample errorCodeSample = new ErrorCodeSample();
			errorCodeSample.setCode(context.stringValue("DescribeApiDocResponse.ErrorCodeSamples["+ i +"].Code"));
			errorCodeSample.setMessage(context.stringValue("DescribeApiDocResponse.ErrorCodeSamples["+ i +"].Message"));
			errorCodeSample.setDescription(context.stringValue("DescribeApiDocResponse.ErrorCodeSamples["+ i +"].Description"));

			errorCodeSamples.add(errorCodeSample);
		}
		describeApiDocResponse.setErrorCodeSamples(errorCodeSamples);
		
	 	return describeApiDocResponse;
	}
}