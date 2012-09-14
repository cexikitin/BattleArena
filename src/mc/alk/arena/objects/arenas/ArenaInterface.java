package mc.alk.arena.objects.arenas;

import mc.alk.arena.objects.ArenaPlayer;
import mc.alk.arena.objects.MatchResult;
import mc.alk.arena.objects.teams.Team;

/**
 * 
 * @author alkarin
 *
 * helper class to access private members of arena
 * I sorely want the ability to have a friend class like in C++ 
 */
public class ArenaInterface {
	final Arena arena;
	public ArenaInterface(Arena arena){
		this.arena = arena;
	}
	
	public void onOpen(){arena.privateOnOpen();}
	public void onPrestart(){arena.privateOnPrestart();}
	public void onStart(){arena.privateOnStart();}
	public void onVictory(MatchResult result) {arena.privateOnVictory(result);}
	public void onComplete(){arena.privateOnComplete();}
	public void onCancel(){arena.privateOnCancel();}
	public void onEnter(ArenaPlayer p, Team t) {arena.privateOnEnter(p,t);}
	public void onEnterWaitRoom(ArenaPlayer p, Team t) {arena.privateOnEnterWaitRoom(p,t);}
	public void onLeave(ArenaPlayer p, Team t) {arena.privateOnLeave(p,t);}
	public void onJoin(ArenaPlayer p, Team t) {arena.privateOnJoin(p,t);}

}