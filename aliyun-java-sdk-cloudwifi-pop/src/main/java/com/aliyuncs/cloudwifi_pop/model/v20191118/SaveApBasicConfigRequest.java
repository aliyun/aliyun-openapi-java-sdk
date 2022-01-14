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

package com.aliyuncs.cloudwifi_pop.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudwifi_pop.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveApBasicConfigRequest extends RpcAcsRequest<SaveApBasicConfigResponse> {
	   

	private String country;

	private String tokenServer;

	private Integer lanStatus;

	private Integer scan;

	private String description;

	private Integer workMode;

	private String dai;

	private String lanMask;

	private String logIp;

	private Integer insecureAllowed;

	private String protocol;

	private String route;

	private String appName;

	private String vpn;

	private Integer failover;

	private String passwd;

	private Integer logLevel;

	private String name;

	private Integer echoInt;

	private String appCode;

	private Long id;

	private String lanIp;
	public SaveApBasicConfigRequest() {
		super("cloudwifi-pop", "2019-11-18", "SaveApBasicConfig", "cloudap");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putQueryParameter("Country", country);
		}
	}

	public String getTokenServer() {
		return this.tokenServer;
	}

	public void setTokenServer(String tokenServer) {
		this.tokenServer = tokenServer;
		if(tokenServer != null){
			putQueryParameter("TokenServer", tokenServer);
		}
	}

	public Integer getLanStatus() {
		return this.lanStatus;
	}

	public void setLanStatus(Integer lanStatus) {
		this.lanStatus = lanStatus;
		if(lanStatus != null){
			putQueryParameter("LanStatus", lanStatus.toString());
		}
	}

	public Integer getScan() {
		return this.scan;
	}

	public void setScan(Integer scan) {
		this.scan = scan;
		if(scan != null){
			putQueryParameter("Scan", scan.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getWorkMode() {
		return this.workMode;
	}

	public void setWorkMode(Integer workMode) {
		this.workMode = workMode;
		if(workMode != null){
			putQueryParameter("WorkMode", workMode.toString());
		}
	}

	public String getDai() {
		return this.dai;
	}

	public void setDai(String dai) {
		this.dai = dai;
		if(dai != null){
			putQueryParameter("Dai", dai);
		}
	}

	public String getLanMask() {
		return this.lanMask;
	}

	public void setLanMask(String lanMask) {
		this.lanMask = lanMask;
		if(lanMask != null){
			putQueryParameter("LanMask", lanMask);
		}
	}

	public String getLogIp() {
		return this.logIp;
	}

	public void setLogIp(String logIp) {
		this.logIp = logIp;
		if(logIp != null){
			putQueryParameter("LogIp", logIp);
		}
	}

	public Integer getInsecureAllowed() {
		return this.insecureAllowed;
	}

	public void setInsecureAllowed(Integer insecureAllowed) {
		this.insecureAllowed = insecureAllowed;
		if(insecureAllowed != null){
			putQueryParameter("InsecureAllowed", insecureAllowed.toString());
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
		if(route != null){
			putQueryParameter("Route", route);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getVpn() {
		return this.vpn;
	}

	public void setVpn(String vpn) {
		this.vpn = vpn;
		if(vpn != null){
			putQueryParameter("Vpn", vpn);
		}
	}

	public Integer getFailover() {
		return this.failover;
	}

	public void setFailover(Integer failover) {
		this.failover = failover;
		if(failover != null){
			putQueryParameter("Failover", failover.toString());
		}
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
		if(passwd != null){
			putQueryParameter("Passwd", passwd);
		}
	}

	public Integer getLogLevel() {
		return this.logLevel;
	}

	public void setLogLevel(Integer logLevel) {
		this.logLevel = logLevel;
		if(logLevel != null){
			putQueryParameter("LogLevel", logLevel.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getEchoInt() {
		return this.echoInt;
	}

	public void setEchoInt(Integer echoInt) {
		this.echoInt = echoInt;
		if(echoInt != null){
			putQueryParameter("EchoInt", echoInt.toString());
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getLanIp() {
		return this.lanIp;
	}

	public void setLanIp(String lanIp) {
		this.lanIp = lanIp;
		if(lanIp != null){
			putQueryParameter("LanIp", lanIp);
		}
	}

	@Override
	public Class<SaveApBasicConfigResponse> getResponseClass() {
		return SaveApBasicConfigResponse.class;
	}

}
